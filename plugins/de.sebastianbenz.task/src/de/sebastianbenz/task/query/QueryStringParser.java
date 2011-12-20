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
package de.sebastianbenz.task.query;

import static com.google.common.collect.Iterables.filter;
import static org.eclipse.emf.common.util.URI.createURI;

import java.io.IOException;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.xtext.util.StringInputStream;

public class QueryStringParser {

	private ResourceSet resourceSet = createResourceSet();
	
	public Query parse(String input){
		resourceSet.getResources().clear();
		Resource resource = resourceSet.createResource(createURI("MyQuery.__query"));
		try {
			resource.load(new StringInputStream(input), null);
			EcoreUtil.resolveAll(resource);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		return filter(resource.getContents(), Query.class).iterator().next();
	}

	private ResourceSet createResourceSet() {
		ResourceSet resourceSet = new ResourceSetImpl();
		return resourceSet;
	}
	
}
