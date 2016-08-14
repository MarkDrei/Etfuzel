package net.dreiucker.etfuzel.ui;

import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import net.dreiucker.etfuzel.memento.Memento;
import net.dreiucker.etfuzel.memento.MementoFileHandler;
import net.dreiucker.etfuzel.memento.MementoList;

public class MementosView {

	private MementoList list;
	private Table table;
	
	public MementosView(Composite mainArea) {
		list = (new MementoFileHandler()).loadMementos();
		
		createUserInterface(mainArea);
				
	}

	private void createUserInterface(Composite mainArea) {
		mainArea.setLayout(new FillLayout());
		SashForm sash = new SashForm(mainArea, SWT.HORIZONTAL);
		
		Composite list = new Composite(sash, SWT.NONE);
		createMementolistInterface(list);
		
		Composite tabArea = new Composite(sash, SWT.NONE);
		tabArea.setLayout(new FillLayout());
		Button right = new Button(tabArea, SWT.PUSH);
		right.setText("tab area");
		
		mainArea.pack();
		mainArea.layout();
	}

	private void createMementolistInterface(Composite listArea) {
		listArea.setLayout(new FillLayout());
		
		table = new Table(listArea, SWT.MULTI | SWT.BORDER | SWT.FULL_SELECTION);
		table.setLinesVisible(true);
		table.setHeaderVisible(true);
		TableColumn title = new TableColumn(table, SWT.NONE);
		title.setText("Memento");

		updateTableContents();
	}

	private void updateTableContents() {
		table.clearAll();
		for (Memento memento : list.getMementos()) {
			TableItem item = new TableItem(table, SWT.NONE);
			item.setText(0, memento.getTitle());
		}
		table.getColumn(0).pack();
	}

	public void storeData() {
		MementoFileHandler handler = new MementoFileHandler();
		handler.saveMementos(list);
		
	}

	public void loadData() {
		list = (new MementoFileHandler()).loadMementos();
		updateTableContents();
	}
}
