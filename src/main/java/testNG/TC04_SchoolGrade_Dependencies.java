package testNG;

import org.testng.annotations.Test;

public class TC04_SchoolGrade_Dependencies {

	@Test(enabled = true)
	public void highSchool() {
		System.out.println("High Scool");
	}
	
	
	
	//By adding dependsOnMethods in @Test Annotation
	
	//Even if depends on methods got failed also we can pass the next method by giving alwaysRun=true ..
	//find below
	
	@Test(dependsOnMethods="highSchool",alwaysRun=true)
	public void higherSecondrySchool() {
		System.out.println("Higher Secondry Scool");
	}
	
	
	
	
	
	@Test(dependsOnMethods="higherSecondrySchool")
	public void engineeringcollege() {
		System.out.println("Engineering College");
	}
	
	
		
}
