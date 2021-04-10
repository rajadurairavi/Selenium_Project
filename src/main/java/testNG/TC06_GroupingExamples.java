package testNG;

import org.testng.annotations.Test;

public class TC06_GroupingExamples {
	
	@Test(groups= {"Apple"})
	public void apple1() {
		System.out.println("Apple Testing");
	}
	@Test(groups= {"Apple"})
    public void apple2() {
    	System.out.println("Apple Testing");
	}
	@Test(groups= {"Moto"})
	public void moto1() {
		System.out.println("Moto Testing");
	}
	@Test(groups= {"Moto"})
    public void moto2() {
    	System.out.println("Moto Testing");
	}
	@Test(groups= {"Vivo"})
	public void vivo1() {
		System.out.println("Vivo Tesing");
	}
	@Test(groups= {"Vivo"})
    public void vivo2() {
    	System.out.println("Vivo Tesing");
	}
	@Test(groups= {"Lenovo"})
	public void lenevo1() {
		System.out.println("Lenovo Testing");
	}
	@Test(groups= {"Lenovo"})
    public void lenevo2() {
    	System.out.println("Lenovo Testing");
	}
	
}
