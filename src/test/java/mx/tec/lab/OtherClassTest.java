package mx.tec.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class OtherClassTest {
	@Test
	public void testMultiply() {
		int x = 10;
		int y = 3;
		
		assertEquals(x*y, OtherClass.multiply(x,y));
	}

	@Test
	public void testMultiply_ExceptionIsThrown() {
		OtherClass oc = new OtherClass();
		try {
			oc.multiply(1000, 0);
		}
		catch(IllegalArgumentException e) {
			assertEquals("X should be less than 1000", e.getMessage());
		}
	}
}


