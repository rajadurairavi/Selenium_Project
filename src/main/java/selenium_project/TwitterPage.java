package selenium_project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TwitterPage {
	@Test
	//@Test(priority=3)
	
	public static void twitterPage() throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com");
		Thread.sleep(5000);
		driver.findElementByXPath("//span[text()='Sign up']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='name']").sendKeys("Abc");
		driver.findElementByXPath("//input[@name='phone_number']").sendKeys("9629610897");
		Thread.sleep(3000);
		WebElement twmonth = driver.findElementByXPath("//select[@aria-label='Month']");
		Select Selmonth = new Select(twmonth);
		Selmonth.selectByVisibleText("April");
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
	    File screenshot = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("C:\\Selenium\\ScreenShots\\TwitterPage.jpeg"));
		System.out.println("Screenshot has been taken");
		

		driver.quit();
		
	}



}
