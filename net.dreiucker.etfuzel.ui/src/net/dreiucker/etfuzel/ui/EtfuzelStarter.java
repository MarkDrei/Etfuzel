package net.dreiucker.etfuzel.ui;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public class EtfuzelStarter {

	public static void main(String[] args) {
		Display display = Display.getDefault();
		Shell shell = EtfuzelShell.createEtfuzelInstance(display);
		
		shell.open();
		
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		

	}

}
