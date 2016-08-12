package net.dreiucker.etfuzel.memento;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class MementoInt extends AMementoPart {
	
	private int number;
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}

}
