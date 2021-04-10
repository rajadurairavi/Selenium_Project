package practice_project;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27_ScrollActions {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");

		driver.switchTo().activeElement().sendKeys("Tiruvannamalai \n");

		//scroll to some postions
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("window.scroll(0,200)", "");
		Thread.sleep(2000);
		executor.executeScript("window.scroll(0,-200)", "");
		Thread.sleep(1000);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(2000);
		
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);
		
		//We can use javascriptClick to click any position of the elemenet in webpage
		
		Thread.sleep(1000);
		
		System.out.println("Scrolls functions completed..Happyyyyyyyyy..!!!");
		
		
		driver.quit();

	}

}
