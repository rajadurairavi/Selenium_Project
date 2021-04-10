package practice_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test08_DragAndDropExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/drop.html");
		System.out.println("Browser got launched");
		
		WebElement from = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement To = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		Actions action = new Actions(driver);
		
		// FirstWay
		//action.clickAndHold(from).moveToElement(To).release(To).build().perform();
		
		//SecondWay
		action.dragAndDrop(from, To).build().perform();
		
		
		driver.quit();

	}

}
