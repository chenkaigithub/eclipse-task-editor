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

import static de.sebastianbenz.task.ui.editor.TaskTokenTypeToPartitionTypeMapper.CODE_PARTITION;
import static org.eclipse.jface.text.IDocumentExtension3.DEFAULT_PARTITIONING;
import static org.eclipse.jface.text.TextUtilities.getContentType;

import org.apache.log4j.Logger;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.source.ISourceViewer;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.swt.custom.LineBackgroundEvent;
import org.eclipse.swt.custom.LineBackgroundListener;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;

import de.sebastianbenz.task.ui.highlighting.ColorScheme;

public class TaskEditor extends ExtLinkedXtextEditor {
	private static final Logger LOG = Logger.getLogger(TaskEditor.class);
	
	public class CodeBackgroundColorizer implements LineBackgroundListener {
		private Color background;

		public void lineGetBackground(LineBackgroundEvent event) {
			int previousLine = event.lineOffset - 1;
			if (!isCode(previousLine)) {
				return;
			}

			int leftContentType = event.lineOffset;
			if (!isCode(leftContentType)) {
				return;
			}
			
			int nextLine = event.lineOffset + event.lineText.length() + 2;
			if (!isCode(nextLine)) {
				return;
			}
			event.lineBackground = getBackgroundColor();
		}

		private Color getBackgroundColor() {
			if (background == null) {
				background = new Color(Display.getDefault(), ColorScheme.BACKGROUND);
			}
			return background;
		}

		private boolean isCode(int offset) {
			if (offset <= 0  || offset > getDocument().getLength()) {
				return false;
			}
			try {
				String contentType = getContentType(getDocument(), DEFAULT_PARTITIONING,	offset, false);
				return CODE_PARTITION.equals(contentType);
			} catch (BadLocationException e) {
				LOG.error(e.getMessage(), e);
				return false;
			}
		}

		public void dispose() {
			getBackgroundColor().dispose();
			background = null;
		}
	}

	@Override
	protected ISourceViewer createSourceViewer(Composite parent,
			IVerticalRuler ruler, int styles) {
		ISourceViewer result = super.createSourceViewer(parent, ruler, styles);
		result.getTextWidget().setWordWrap(true);
		result.getTextWidget().addLineBackgroundListener(createBackgroundColorizer());
		return result;
	}

	protected CodeBackgroundColorizer createBackgroundColorizer() {
		return new CodeBackgroundColorizer();
	}

	@Override
	public void dispose() {
		super.dispose();
		createBackgroundColorizer().dispose();
	}

}
