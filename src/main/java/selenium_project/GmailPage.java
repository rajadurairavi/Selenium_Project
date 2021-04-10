package selenium_project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GmailPage {
	
	@Test
	//@Test(priority=4)
	
	public static void gmailPage() throws InterruptedException, Exception {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		Thread.sleep(5000);
		driver.findElementByXPath("//span[text()='Create account']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//div[text()='For myself']").click();
		Thread.sleep(5000);
		driver.findElementByXPath("//input[@id='firstName']").sendKeys("Rajadurai");
		driver.findElementByXPath("//input[@id='lastName']").sendKeys("Ravi");
		driver.findElementByXPath("//input[@id='username']").sendKeys("rajaduraivijay7");
		driver.findElementByXPath("//input[@name='Passwd']").sendKeys("password");
		driver.findElementByXPath("//input[@name='ConfirmPasswd']").sendKeys("Cpassword");
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
	    File screenshot = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("C:\\Selenium\\ScreenShots\\GmailPage.jpeg"));
		System.out.println("Screenshot has been taken");
		
		WebElement we = driver.findElementByXPath("//span[text()='Sign in instead']");
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", we);
		driver.navigate().refresh();
		driver.quit();
		

		
	}


}
