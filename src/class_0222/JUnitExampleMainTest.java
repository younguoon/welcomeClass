package class_0222;

import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JUnitExampleMainTest {
	JUnitExamMain jem;
	
	@BeforeClass
	public static void setUpClass(){
		System.out.println("setUpClass");
	}
	
	@AfterClass
	public static void tearDownClass(){
		System.out.println("tearDownClass");
	}
	
	@Before
	public void setUp() {
		System.out.println("setUp()...start");
		jem = new JUnitExamMain(10);
		System.out.println("setUp() end");
	}
	
	@Before
	public void tearDown() {
		System.out.println("tearDown()...start");
		jem = null;
		System.out.println("tearDowns() end");
			
	}
	
	
	@Test
	public void testAdd1() {
		System.out.println("testAdd1()...start");
		jem = new JUnitExamMain(10);
		System.out.println("testAdd1() end");
		assertEquals(30, jem.add(20));
	}
	
	@Test
	public void testAdd2() {
		System.out.println("testAdd2...start");
		jem = new JUnitExamMain(10);
		System.out.println("testAdd2() end");
		assertEquals(40, jem.add(20));
	}
		

}
