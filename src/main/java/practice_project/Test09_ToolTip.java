package practice_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test09_ToolTip {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/tooltip.html");
		System.out.println("Browser got launched");
		
		WebElement tooltip = driver.findElement(By.xpath("//input[@id='age']"));
		String text = tooltip.getAttribute("title");
		System.out.println(text);
		
		driver.quit();
			
	}

}
