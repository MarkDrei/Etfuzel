package net.dreiucker.etfuzel.memento;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MementoText extends AMementoPart {

	private String text;
	
	public void setText(String text) {
		this.text = text;
	}
	
	public String getText() {
		return text;
	}
}
