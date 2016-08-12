package net.dreiucker.etfuzel.memento;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Main class for storing 
 *  
 * @decision xmlTechnology
 * @requirement ReqHL_01
 */
@XmlRootElement
public class Memento  {
	
	private String title;

//	// XmLElementWrapper generates a wrapper element around XML representation
	@XmlElementWrapper(name = "partlist")
	@XmlElementRef
	private ArrayList<AMementoPart> parts;
	
	private Memento() {
		parts = new ArrayList<AMementoPart>();
	}
	
	public Memento(String title) {
		this();
		this.title = title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}


	
	public void setParts(AMementoPart part) {
		parts.add(part);
	}
}
