package practice_project;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class Test28_AssertVsVerify {
	
	// *** Assert: 1 9 STD in school but verify is like 10 and 12 th standard 
	
	@Test
	public void assertTest() {
		
		System.out.println("Before assert"); //it will print
		
	//	Assert.assertEquals(true, false);
		
		System.out.println("After assert"); //it wont print
		
	}
	
	@Test
	public void verifyTest() {
		
		SoftAssert assert1 = new SoftAssert();
		
		System.out.println("Before verify"); //both will print
		
		assert1.assertEquals(true, false);
		
		System.out.println("After verify"); //both will print
	}

}
