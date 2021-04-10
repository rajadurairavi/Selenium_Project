package practice_project;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test13_UploadFilesExamples {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/upload.html");
		System.out.println("Browser got launched");
		
		WebElement element = driver.findElement(By.xpath("//input[@name='filename']"));
		Actions action = new Actions(driver);
		
		action.moveToElement(element).click().perform();
		
		Thread.sleep(1000);
		String filepath = "C:\\Users\\Rajadurai\\Desktop\\abc.xlsx";
		StringSelection strselection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(strselection, null);
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		Thread.sleep(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		driver.quit();
		
	}

}
