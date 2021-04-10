
package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TC05_BaseTest_SuiteExecution {
	
	WebDriver driver;
	Long starttime;
	Long endtime;
	Long totaltime;
	
	
	@BeforeSuite
	public void launchBrowser() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		starttime = System.currentTimeMillis();
		System.out.println("Start time is "+starttime);	
	}
	@Test(priority = 0)
	public void openGoogle() {
		driver.get("https://www.google.com/");
	}
	@Test(priority = 1,enabled=false)
	public void openfaceBook() {
		driver.get("https://www.facebook.com/");
	}
	@Test(priority = 2)
	public void openRedBus() {
		driver.get("https://www.redbus.com/");
	}
	@AfterSuite
	public void closeBrowser() {
		driver.navigate().refresh();
		driver.quit();
		endtime = System.currentTimeMillis();
		System.out.println("Emd time is "+endtime);
		totaltime = endtime-starttime;
		System.out.println("Total time is "+totaltime);
	}
}
