package net.dreiucker.etfuzel.ui;

import net.dreiucker.etfuzel.memento.Memento;
import net.dreiucker.etfuzel.memento.MementoFileHandler;
import net.dreiucker.etfuzel.memento.MementoList;

public class MementosView {

	private MementoList list;
	
	public MementosView() {
		list = new MementoList();
		list.add(new Memento("the title"));
	}

	public void storeData() {
		MementoFileHandler handler = new MementoFileHandler();
		handler.saveMementos(list);
		
	}
}
