package test;
import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import main.Calculator;

import org.junit.AfterClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)

public class ParameterizedMulTest {
	 

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}
	 // Fields
  private int d1;
  private int d2;
  private int expectedResult;

	
		//Constructor.
		//The JUnit test runner will instantiate this class once for every
		//element in the Collection returned by the method annotated with
		//@Parameters.
	public ParameterizedMulTest(int d1, int d2,int expected)
	{
		this.d1 = d1;
		this.d2=d2;
		this.expectedResult = expected;
	}
	   
	       @Parameters
	       public static Collection<Object[]> generateData()
	       {
	        // In this example, the parameter generator returns a List of
	         // arrays.  Each array has two elements: { datum, expected }.
	          // These data are hard-coded into the class, but they could be
	          // generated or loaded in any way you like.
	          Object [][] data=new Object[][]
	        {
	            { 2, 3,6 },
	            { 3,4,12  },
	            { 4,5,20 }
	        };
	          return Arrays.asList(data);

	        }
	       
	   
	    @Test
	     public void testWhatever()
	     {
	    	Calculator cal = new Calculator();
	      
	       assertEquals(expectedResult, cal.mul(d1,d2));
	     }
	  }
	  

 
