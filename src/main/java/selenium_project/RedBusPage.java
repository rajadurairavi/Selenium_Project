package selenium_project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RedBusPage {
	
	@Test
	//@Test(priority=1)

	public static void redBus() throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.com");
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='src']").sendKeys("Chennai");
		driver.findElementByXPath("//input[@id='dest']").sendKeys("Bangalore");

		TakesScreenshot ts = ((TakesScreenshot)driver);
	    File screenshot = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("C:\\Selenium\\ScreenShots\\RedBusPage.jpeg"));
		System.out.println("Screenshot has been taken");
		
		driver.navigate().refresh();
		driver.quit();
		
		
	}



}
