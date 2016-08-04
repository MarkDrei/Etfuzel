package net.dreiucker.etfuzel.memento;

import static org.junit.Assert.*;

import org.junit.Test;

import net.dreiucker.etfuzel.memento.Memento;

public class MementoTest {
	
	@Test
	public void testMementoBasic() {
		Memento memento = new Memento("title");
		assertEquals("title", memento.getTitle());
	}

}
