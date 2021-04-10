package testNG;

import org.testng.annotations.Test;
import org.testng.internal.thread.ThreadTimeoutException;

public class TC12_InvokationCount {
	
	@Test(invocationCount=5,timeOut=2000,expectedExceptions=ThreadTimeoutException.class) 
	public void executionCount() throws Exception {
		
		//learning of Invocation count and Timeout and Expected exceptions concepts
		
		Thread.sleep(3000);
		System.out.println("Raja");
		
	}

}
