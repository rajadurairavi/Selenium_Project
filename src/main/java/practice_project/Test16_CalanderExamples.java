package practice_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test16_CalanderExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Calendar.html");
		System.out.println("Browser got launched");
		
		
		//Select 10th day of following month
		WebElement Calander = driver.findElement(By.xpath("//input[@id='datepicker']"));
		Calander.click();
		
		WebElement nextmonth = driver.findElement(By.xpath("//span[text()='Next']"));
		nextmonth.click();
		
		WebElement Day10 = driver.findElement(By.xpath("//a[text()='10']"));
		Day10.click();
		
		
		
		

	}

}
