package net.dreiucker.etfuzel.memento;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author Mark
 * 
 * @decision xmlTechnology
 *
 */
@XmlRootElement(namespace = "net.dreiucker.etfuzel.memento")
public class MementoList {

	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "mementos")
	// XmlElement sets the name of the entities
	@XmlElement(name = "memento")
	private ArrayList<Memento> mementos;

	public MementoList() {
		mementos = new ArrayList<Memento>();
	}
	
	public void add(Memento memento) {
		mementos.add(memento);
	}
	
	public ArrayList<Memento> getMementos() {
		return mementos;
	}
	
}
