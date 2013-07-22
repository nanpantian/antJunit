package test;
import static org.junit.Assert.*;
import  main.Calculator;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest extends Calculator {

	public CalculatorTest() {
	}

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		 Calculator tester=new Calculator();
		 assertEquals("10 + 5 must be 15",  15, tester.add(10, 5));

	}

	@Test
	public void testSub() {
		 Calculator tester=new Calculator();
		 assertEquals("10 - 5 must be 5", 5, tester.sub(10, 5));

	}

	@Test(timeout=1000)
	public void testMul() {
		 Calculator tester=new Calculator();
		 assertEquals("10 * 5 must be 50", 50, tester.mul(10, 5));

	}

	@Test(expected = IllegalArgumentException.class)
	  public void testMulExceptionIsThrown() {
	    Calculator tester = new Calculator();
	    tester.mul(1000, 5);
	  }

	
	@Test
	public void testDiv() {
		 Calculator tester=new Calculator();
		 assertEquals("10 / 5 must be 2", 2, tester.div(10, 5));

	}
	
	//@Ignore 
	//Ignores the test method. 
	//This is useful when the underlying code has been changed and the test case has not yet been adapted. 
	//Or if the execution time of this test is too long to be included.  

}
