package practice_project;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test03_DropDownExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		System.out.println("Browser got launched");
		
		WebElement element = driver.findElement(By.xpath("//select[@id='dropdown1']"));
		Select select = new Select(element);
		select.selectByIndex(1);
		Thread.sleep(3000);
		select.selectByValue("2");
		Thread.sleep(3000);
		select.selectByVisibleText("UFT/QTP");
		
		Thread.sleep(3000);
		// Dropdown options count
		List<WebElement> AllOptions = select.getOptions();
		int count = AllOptions.size();
		System.out.println(count);
		driver.quit();		

	}

}
