/*
* generated by Xtext
*/
package de.sebastianbenz.task;

import org.eclipse.xtext.junit4.IInjectorProvider;

import com.google.inject.Injector;

public class TaskUiInjectorProvider implements IInjectorProvider {
	
	public Injector getInjector() {
		return de.sebastianbenz.task.ui.internal.TaskActivator.getInstance().getInjector("de.sebastianbenz.task.Task");
	}
	
}
