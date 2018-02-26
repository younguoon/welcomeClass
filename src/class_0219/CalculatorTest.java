package class_0219;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	
	@Test
	public void testSum() {
		Calculator c = new Calculator();
//		1. 값을 보증해줌 
//         ex) 10+20 = 30일 때 맞다. 원하는 값이 나오는 것에대한 보장을 해줌
		assertEquals(c.sum(10, 20),	30);
	}
	
	@Test(timeout=3000)
	public void testFac() {
		Calculator c = new Calculator();
		assertEquals(c.fac(1), 1);
		assertEquals(c.fac(2), 2);
		assertEquals(c.fac(3), 6);
		assertEquals(c.fac(4), 24);
		assertEquals(c.fac(10), 3628800);
	}
	
	
}
