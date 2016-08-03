package dreiucker.net.etfuzel.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

/**
 * The main window of the Etfuzel application.
 * Handles creation and layout of the sub widgets.
 * 
 * @author Mark
 * 
 * @decision windowToolkitSWT
 *
 */
public class EtfuzelShell {
	
	private Shell shell;
	
	/**
	 * Factory method which 
	 * @param display
	 * @return
	 */
	public static Shell createEtfuzelInstance(Display display) {
		Shell shell2 = new EtfuzelShell(display).shell;
		shell2.open();
		return shell2;
	}

	private EtfuzelShell(Display display) {
		shell = new Shell(display, SWT.CLOSE | SWT.TITLE | SWT.MIN | SWT.MAX | SWT.RESIZE);
		
		// TODO add child widgets
	}
}
