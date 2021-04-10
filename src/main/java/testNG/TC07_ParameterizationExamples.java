package testNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC07_ParameterizationExamples {
	
	
	@Test
	@Parameters("MyName")
	public void printName(String MyName) {
		
		System.out.println("My name is "+ MyName);
	}
	
	

}
