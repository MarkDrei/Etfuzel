package net.dreiucker.etfuzel.memento;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Main class for storing 
 *  
 * @decision xmlTechnology
 */
@XmlRootElement(name = "memento")
public class Memento  {
	
	private String title;

	@SuppressWarnings("unused")
	private Memento() {
		// only for XML construction
	}
	
	public Memento(String title) {
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
		
	}
}
