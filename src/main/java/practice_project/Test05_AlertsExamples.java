package practice_project;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test05_AlertsExamples {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Alert.html");
		System.out.println("Browser got launched");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Simple Alerts
		WebElement SimpleAlert = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		SimpleAlert.click();
		
		driver.switchTo().alert().accept();
		
		//Confirmation Alerts
		WebElement ConfirmationAlerts = driver.findElement(By.xpath("//button[text()='Confirm Box']"));
		ConfirmationAlerts.click();
		
		driver.switchTo().alert().accept();
		
		ConfirmationAlerts.click();
		
		driver.switchTo().alert().dismiss();
		
		//PromptAlerts
		WebElement PromptAlerts = driver.findElement(By.xpath("//button[text()='Prompt Box']"));
		PromptAlerts.click();
		
		driver.switchTo().alert().sendKeys("Liberty");
		driver.switchTo().alert().accept();
		
		//Sweet Alerts
		
		WebElement SweetAlert = driver.findElement(By.xpath("//button[text()='Sweet Alert']"));
		SweetAlert.click();
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
