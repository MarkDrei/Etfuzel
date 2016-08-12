package net.dreiucker.etfuzel.ui;

import net.dreiucker.etfuzel.memento.Memento;
import net.dreiucker.etfuzel.memento.MementoFileHandler;
import net.dreiucker.etfuzel.memento.MementoList;
import net.dreiucker.etfuzel.memento.MementoText;

public class MementosView {

	private MementoList list;
	
	public MementosView() {
		list = new MementoList();
		Memento memento = new Memento("the title");
		MementoText text = new MementoText();
		text.setText("This is the text for the memento");
		memento.setParts(text);
		memento.setParts(text);
		list.add(memento);
		
	}

	public void storeData() {
		MementoFileHandler handler = new MementoFileHandler();
		handler.saveMementos(list);
		
	}
}
