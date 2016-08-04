package dreiucker.net.etfuzel.memento;

import static org.junit.Assert.*;

import org.junit.Test;

public class MementoTest {
	
	@Test
	public void testMementoBasic() {
		Memento memento = new Memento("title");
		assertEquals("titl", memento.getTitle());
	}

}
