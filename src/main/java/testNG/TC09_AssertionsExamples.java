package testNG;

import org.testng.annotations.Test;

import junit.framework.Assert;

public class TC09_AssertionsExamples {

	
	String name = "Raja";
	boolean value = true;
	
	@Test
	public void equalCheck() {
		
		Assert.assertEquals(name, "Raja");
		Assert.assertTrue("This should be true", value);
		
		
	}
	
	
	
	
}
