package practice_project;

import java.io.File;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Test21_WaitPractise{
	
	@Test
	//@Test(priority=3)
	
	public static void twitterPage() throws InterruptedException, Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.twitter.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		//Thread.sleep(5000);  ---- Java Wait
		
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); -- Explicitly wait
		
		driver.findElementByXPath("//span[text()='Sign up']").click();
		
		/*WebDriverWait Wait = new WebDriverWait(driver, 60);
		WebElement element = Wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='name']")));
		element.sendKeys("Raja");   ---Explicitly Wait                   */
		
		/*Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3))
				.ignoring(NoSuchElementException.class);
		
		WebElement element =wait.until(new Function<WebDriver, WebElement>() {

			public WebElement apply(WebDriver driver) {
				// TODO Auto-generated method stub
				return driver.findElement(By.xpath("//input[@name='name']"));
			}
		});
		
		element.sendKeys("Raja");     Fluent Wait */
		
		
		driver.findElementByXPath("//input[@name='name']").sendKeys("Raja");
		driver.findElementByXPath("//input[@name='phone_number']").sendKeys("9629610897");
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
