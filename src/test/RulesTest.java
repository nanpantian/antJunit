package test;
import static org.junit.Assert.*;

import java.io.File;
import java.io.IOException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;


public class RulesTest {

	public RulesTest() {
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
 

	@Rule  
	public TemporaryFolder folder = new TemporaryFolder();  
	  
	@Test  
	public void shouldLoadFromPropertiesFile() throws IOException {  
	    File createdFile= folder.newFile("myfile.txt");  
	    File createdFolder= folder.newFolder("subfolder");  
	} 

}
