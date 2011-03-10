package de.sebastianbenz.task.ui.highlighting;

import org.eclipse.jface.resource.JFaceResources;
import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.FontData;
import org.eclipse.swt.graphics.RGB;
import org.eclipse.xtext.ui.editor.syntaxcoloring.DefaultHighlightingConfiguration;
import org.eclipse.xtext.ui.editor.syntaxcoloring.IHighlightingConfigurationAcceptor;
import org.eclipse.xtext.ui.editor.utils.TextStyle;

public class Configuration extends DefaultHighlightingConfiguration {
	
	public static final String NOTE_ID = "node";
	public static final String URL_ID = "url";
	public static final String PROJECT1_ID = "project1";
	public static final String PROJECT2_ID = "project2";
	public static final String PROJECT3_ID = "project3";
	public static final String TASK_DONE_ID = "taskDone";
	public static final String TASK_OPEN_ID = "taskOpen";
	public static final String TAG_ID = "tag";

	public void configure(IHighlightingConfigurationAcceptor acceptor) {
		acceptor.acceptDefaultHighlighting(KEYWORD_ID, "Keyword", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(PUNCTUATION_ID, "Punctuation character", punctuationTextStyle());
		acceptor.acceptDefaultHighlighting(COMMENT_ID, "Comment", commentTextStyle());
		acceptor.acceptDefaultHighlighting(STRING_ID, "String", stringTextStyle());
		acceptor.acceptDefaultHighlighting(NUMBER_ID, "Number", numberTextStyle());
		acceptor.acceptDefaultHighlighting(DEFAULT_ID, "Default", defaultTextStyle());
		acceptor.acceptDefaultHighlighting(INVALID_TOKEN_ID, "Invalid Symbol", errorTextStyle());
		
		acceptor.acceptDefaultHighlighting(NOTE_ID, "Note", nodeTextStyle());
		acceptor.acceptDefaultHighlighting(URL_ID, "Url", urlTextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT1_ID, "Project1", project1TextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT2_ID, "Project2", project2TextStyle());
		acceptor.acceptDefaultHighlighting(PROJECT3_ID, "Project3", project3TextStyle());
		
		acceptor.acceptDefaultHighlighting(TASK_DONE_ID, "Task closed", taskDoneTextStyle());
		acceptor.acceptDefaultHighlighting(TASK_OPEN_ID, "Task open", taskOpenTextStyle());
		acceptor.acceptDefaultHighlighting(TAG_ID, "Tags", tagTextStyle());
	}

	private TextStyle taskOpenTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		return textStyle;
	}

	private TextStyle taskDoneTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setStyle(TextAttribute.STRIKETHROUGH);
		return textStyle;
	}

	private TextStyle project3TextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(12));
		return textStyle;
	}

	private TextStyle project2TextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(13));
		return textStyle;
	}

	private TextStyle project1TextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setFontData(fontWithHeight(14));
		return textStyle;
	}

	protected FontData fontWithHeight(int height) {
		return new FontData(JFaceResources.HEADER_FONT, height, SWT.BOLD);
	}

	private TextStyle urlTextStyle() {
		TextStyle textStyle = nodeTextStyle().copy();
		textStyle.setStyle(TextAttribute.UNDERLINE);
		return textStyle;
	}

	private TextStyle nodeTextStyle() {
		TextStyle textStyle = defaultTextStyle().copy();
		textStyle.setColor(grey());
		return textStyle;
	}

	protected RGB grey() {
		return new RGB(125, 125, 125);
	}
	
	private TextStyle tagTextStyle() {
		TextStyle textStyle = nodeTextStyle().copy();
		textStyle.setStyle(TextAttribute.UNDERLINE);
		textStyle.setColor(grey());
		return textStyle;
	}
	
	@Override
	public TextStyle defaultTextStyle() {
		TextStyle result = super.defaultTextStyle().copy();
		result.setFontData(new FontData(JFaceResources.DIALOG_FONT, 11, SWT.NORMAL));
		return result;
	}
}
