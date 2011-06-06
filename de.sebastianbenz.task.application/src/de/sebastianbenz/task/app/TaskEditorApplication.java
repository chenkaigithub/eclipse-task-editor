package de.sebastianbenz.task.app;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;
import org.eclipse.swt.widgets.Display;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.application.WorkbenchAdvisor;

public class TaskEditorApplication implements IApplication {

	/*
	 * @see org.eclipse.equinox.app.IApplication#start(org.eclipse.equinox.app.
	 * IApplicationContext)
	 * 
	 * @since 3.3
	 */
	public Object start(IApplicationContext context) throws Exception {
		WorkbenchAdvisor workbenchAdvisor = new TaskEditorWorkbenchAdvisor(arguments(context));
		Display display = PlatformUI.createDisplay();
		try {
			int returnCode = PlatformUI.createAndRunWorkbench(display,
					workbenchAdvisor);
			if (returnCode == PlatformUI.RETURN_RESTART)
				return IApplication.EXIT_RESTART;
			return IApplication.EXIT_OK;
		} finally {
			display.dispose();
		}
	}

	private String[] arguments(IApplicationContext context) {
		Object value = context.getArguments().get("application.args");
		if (value instanceof String[]) {
			return (String[]) value;
		}
		return new String[0];
	}

	/*
	 * @see org.eclipse.equinox.app.IApplication#stop()
	 * 
	 * @since 3.3
	 */
	public void stop() {
	}
}