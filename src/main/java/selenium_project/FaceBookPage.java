
package selenium_project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FaceBookPage {
	
	@Test(dataProvider="fetchData",dataProviderClass=DP.class)
	//@Test(priority=5)
	
	public static void faceBook(String userName,String password,String firstName,
			String lastName,String email,String password2, String dobDate, String dobMonth, String dobYear) 
					throws InterruptedException, Exception {
		
		int dobMonthh = Integer.parseInt(dobMonth);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		driver.findElementByXPath("//input[@name='email']").sendKeys(userName);
		driver.findElementByXPath("//input[@id='pass']").sendKeys(password);
		driver.findElementByXPath("//a[text()='Create New Account']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@name='firstname']").sendKeys(firstName);
		driver.findElementByXPath("//input[@name='lastname']").sendKeys(lastName);
		driver.findElementByXPath("//input[@name='reg_email__']").sendKeys(email);
		driver.findElementByXPath("//input[@name='reg_passwd__']").sendKeys(password2);
		
		Thread.sleep(3000);
		WebElement day = driver.findElementByXPath("//select[@id='day']");
		Select dayselect = new Select(day);
		dayselect.selectByValue(dobDate);
		
		WebElement month = driver.findElementByXPath("//select[@id='month']");
		Select monthselect = new Select(month);
		monthselect.selectByIndex(dobMonthh);
		
		Thread.sleep(3000);
		WebElement year = driver.findElementByXPath("//select[@id='year']");
		Select yearselect = new Select(year);
		yearselect.selectByVisibleText(dobYear);
		
		TakesScreenshot ts = ((TakesScreenshot)driver);
	    File screenshot = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("C:\\Selenium\\ScreenShots\\FaceBookPage.jpeg"));
		System.out.println("Screenshot has been taken");
		
		
		Thread.sleep(3000);
		driver.findElementByXPath("//label[text()='Custom']").click();
		driver.findElementByXPath("//button[@name='websubmit']").click();
		driver.quit();
					
			
	}


	

}
