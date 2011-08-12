/*******************************************************************************
 * Copyright (c) 2011 Sebastian Benz.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Sebastian Benz - initial API and implementation
 ******************************************************************************/
package de.sebastianbenz.task.ui.views;

import static com.google.common.collect.Iterables.concat;
import static com.google.common.collect.Iterables.filter;
import static java.util.Collections.emptyList;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.resource.IResourceDescription;
import org.eclipse.xtext.resource.IResourceDescription.Delta;
import org.eclipse.xtext.resource.IResourceDescriptions;

import com.google.common.collect.Maps;
import com.google.inject.Inject;

import de.sebastianbenz.task.Content;
import de.sebastianbenz.task.GlobalTaskModel;
import de.sebastianbenz.task.TaskFactory;
import de.sebastianbenz.task.TaskModel;
import de.sebastianbenz.task.ui.views.ViewerUpdater.ResourceDescriptionsChangeListener;

public class GlobalStateManager  implements ResourceDescriptionsChangeListener{

	private static final Logger LOGGER = Logger.getLogger(GlobalStateManager.class);

	@Inject
	private IResourceDescriptions descriptions;

	private ViewerUpdater updater;

	@Inject
	public void setUpdater(ViewerUpdater updater) {
		this.updater = updater;
		updater.addListener(this);
	}
	
	private ResourceSet resourceSet = createResourceSet();

	private GlobalTaskModel root = TaskFactory.eINSTANCE.createGlobalTaskModel();
	
	public ResourceSet createResourceSet() {
		ResourceSetImpl resourceSet = new ResourceSetImpl();
		resourceSet.setURIResourceMap(Maps.<URI, Resource>newHashMap());
		return resourceSet;
	}
	

	protected Iterable<TaskModel> allTaskModels() {
		Iterable<TaskModel> taskModels = emptyList();
		for (Resource resource : resourceSet.getResources()) {
			taskModels = concat(taskModels, taskModelsIn(resource));
		}
		return taskModels;
	}


	protected Iterable<TaskModel> taskModelsIn(Resource resource) {
		return filter(resource.getContents(), TaskModel.class);
	}
	
	protected void updateRootModel(){
		Iterable<TaskModel> taskModels = allTaskModels();
		for (TaskModel taskModel : taskModels) {
			root.getChildren().addAll(taskModel.getChildren());
		}
	}

	public void init() {
		for (IResourceDescription resourceDescription : descriptions.getAllResourceDescriptions()) {
			load(resourceDescription);
		}
		updateRootModel();
	}

	private void load(IResourceDescription description) {
		if(ignore(description)){
			return;
		}
		try{
		Resource resource = resourceSet.getResource(description.getURI(), true);
			EcoreUtil.resolveAll(resource);
			for (TaskModel taskModel : taskModelsIn(resource)) {
				root.getChildren().addAll(taskModel.getChildren());
			}
		}catch (Exception e) {
			// file does not exist anymore
		}
	}


	private boolean ignore(IResourceDescription description) {
		if(description == null){
			return true;
		}
		String extension = description.getURI().lastSegment();
		return !extension.endsWith("todo") && !extension.endsWith("taskpaper");
	}


	public void handleResourceDescriptionChange(List<Delta> deltas) {
		for (Delta delta : deltas) {
			unload(delta.getOld());
			load(delta.getNew());
		}
		updateRootModel();
	}


	private void unload(IResourceDescription description) {
		if(ignore(description)){
			return;
		}
		Resource resource = resourceSet.getResource(description.getURI(), false);
		if(resource == null){
			return;
		}
		Iterator<Content> children = root.getChildren().iterator();
		while (children.hasNext()) {
			if(children.next().eResource() == resource){
				children.remove();
			}
		}
		resource.unload();
	}


	public GlobalTaskModel getRoot() {
		return root ;
	}


	public void dispose() {
		updater.removeListener(this);
		resourceSet.getResources().clear();
		root = null;
	}


	public EObject get(URI uri) {
		try{
			return resourceSet.getEObject(uri, true);
		}catch (Exception e) {
			LOGGER.error(e.getMessage(), e);
			return null;
		}
	}
	
	
}
