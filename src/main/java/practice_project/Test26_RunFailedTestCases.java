package practice_project;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test26_RunFailedTestCases {

	
	// just need to go inside testoutput folder and execute the testng_failed.xml files
	
	@Test
	public void test1() {
		Assert.assertEquals(true, false);
		
	}
	@Test
	public void test2() {
		Assert.assertEquals(true, true);
		
		
	}
}
