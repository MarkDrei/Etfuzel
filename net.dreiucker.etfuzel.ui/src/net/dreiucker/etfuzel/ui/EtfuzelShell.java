package net.dreiucker.etfuzel.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
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
	
	private final Image ICON = new Image(Display.getDefault(), "resources/etfuzel.ico");
	
	private Shell shell;
	private MementosView mementosView;
	private Button load;
	private Button save;
	
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
		shell.setText("Etfuzel 2");
		shell.setImage(ICON);
		GridLayout shellLayout = new GridLayout(1, true);
		shell.setLayout(shellLayout);
		
		Composite topRow = new Composite(shell, SWT.NONE);
		GridData topRowData = new GridData(SWT.BEGINNING, SWT.TOP, false, false);
		topRow.setLayoutData(topRowData);
		configureTopRow(topRow);
		
		Composite mainArea = new Composite(shell, SWT.NONE);
		GridData mainAreaData = new GridData(SWT.FILL, SWT.FILL, true, true);
		mainArea.setLayoutData(mainAreaData);
		configureMainArea(mainArea);
		
		shell.layout();
		
		configureListeners();
	}

	private void configureListeners() {
		load.addListener(SWT.Selection, new Listener() {
			
			@Override
			public void handleEvent(Event event) {
				if (mementosView != null) {
					mementosView.loadData();
				}
				
			}
		});
		save.addListener(SWT.Selection, new Listener() {
			
			public void handleEvent(Event event) {
				if (mementosView != null) {
					mementosView.storeData();
				}
			}
		});
	}

	/**
	 * 
	 */
	private void configureMainArea(Composite mainArea) {
		mementosView = new MementosView(mainArea);
	}

	/**
	 * "Toolbar" for now
	 */
	private void configureTopRow(Composite topRow) {
		topRow.setLayout(new FillLayout());
		
		load = new Button(topRow, SWT.PUSH);
		load.setText("Load Mementos");
		
		save = new Button(topRow, SWT.PUSH);
		save.setText("Save Mementos");
		
		topRow.layout();
	}
}
