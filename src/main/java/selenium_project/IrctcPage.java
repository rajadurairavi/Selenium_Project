package selenium_project;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class IrctcPage {

	@Test
	//@Test(priority=2)

	public static void irctcPage() throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.irctctourism.com");
        
		Thread.sleep(3000);
        driver.findElementByXPath("//span[text()='Flights']").click();
        
        String parentwindow = driver.getWindowHandle();
        for (String childwindow : driver.getWindowHandles()) {
        	
        	driver.switchTo().window(childwindow);
			
		}
        
		Thread.sleep(3000);
		driver.findElementByXPath("//input[@id='stationFrom']").sendKeys("Chennai (MAA)");
		driver.findElementByXPath("//input[@id='stationTo']").sendKeys("Mumbai (BOM)");
		
		driver.close();
		
		driver.switchTo().window(parentwindow);
		
		Thread.sleep(3000);
        driver.findElementByXPath("//span[text()='Flights']").click();
        
        for (String childwindow : driver.getWindowHandles()) {
        	
        	driver.switchTo().window(childwindow);
			
		}
        
		Thread.sleep(8000);
		driver.findElementByXPath("//input[@id='stationFrom']").sendKeys("Chennai (MAA)");
		driver.findElementByXPath("//input[@id='stationTo']").sendKeys("Mumbai (BOM)");
		driver.close();
		driver.switchTo().window(parentwindow);
		Thread.sleep(3000);
		
        driver.findElementByXPath("//span[text()='Flights']").click(); 
        
        TakesScreenshot ts = ((TakesScreenshot)driver);
	    File screenshot = ts.getScreenshotAs(OutputType.FILE);
	    FileUtils.copyFile(screenshot, new File("C:\\Selenium\\ScreenShots\\IrctcPage.jpeg"));
		System.out.println("Screenshot has been taken");
		
        driver.quit();
        		
	}


}
