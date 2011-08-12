package de.sebastianbenz.task.app.actions;

import java.io.File;

import org.eclipse.jface.action.Action;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;


public class OpenFileAction extends Action implements IWorkbenchWindowActionDelegate {
	
	private IWorkbenchWindow fWindow;

	public OpenFileAction() {
		setEnabled(true);
	}

	public void dispose() {
		fWindow= null;
	}

	public void init(IWorkbenchWindow window) {
		fWindow= window;
	}

	public void run(IAction action) {
		run();
	}

	public void selectionChanged(IAction action, ISelection selection) {
	}

	private File queryFile() {
		FileDialog dialog= new FileDialog(fWindow.getShell(), SWT.OPEN);
		dialog.setText("Open File"); //$NON-NLS-1$
		dialog.setFilterExtensions(new String[]{"*.todo;*.taskpaper"});
		String path= dialog.open();
		if (path != null && path.length() > 0)
			return new File(path);
		return null;
	}

    /*
     * @see org.eclipse.jface.action.Action#run()
     */
    public void run() {
		File file= queryFile();
		if (file != null) {
			EditorOpener.open(fWindow, file.toString());
		} 
	}
}