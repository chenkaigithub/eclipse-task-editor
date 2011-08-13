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
package de.sebastianbenz.task.ui.editor;

import static com.google.common.collect.Sets.newHashSet;
import static de.sebastianbenz.task.TaskPackage.Literals.PROJECT;
import static de.sebastianbenz.task.TaskPackage.Literals.TASK_MODEL;

import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.ui.editor.folding.DefaultFoldingRegionProvider;
import org.eclipse.xtext.ui.editor.folding.IFoldingRegionAcceptor;
import org.eclipse.xtext.util.ITextRegion;

import de.sebastianbenz.task.Container;
import de.sebastianbenz.task.Content;

public class FoldingRegionProvider extends DefaultFoldingRegionProvider {
	
	protected void computeObjectFolding(EObject eObject, IFoldingRegionAcceptor<ITextRegion> foldingRegionAcceptor) {
		if (eObject instanceof Content) {
			Content content = (Content) eObject;
			ITextRegion region = getLocationInFileProvider().getFullTextRegion(eObject);
			if (region != null) {
				ITextRegion significant = getLocationInFileProvider().getSignificantTextRegion(eObject);
				if (significant == null)
					throw new NullPointerException("significant region may not be null");
				int offset = region.getOffset();
				int length = region.getLength();
				Container parent = content.getParent();
				if(parent == null){
					return;
				}
				
				EList<Content> siblings = parent.getChildren();
				int lastIndex = siblings.size()-1;
				if(siblings.indexOf(content) != lastIndex){
					ICompositeNode node = NodeModelUtils.getNode(siblings.get(lastIndex));
					length = node.getOffset() + node.getLength() - offset;
				}
				foldingRegionAcceptor.accept(offset, length, significant);
			}
		}
	}
}
