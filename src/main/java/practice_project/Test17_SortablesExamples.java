package practice_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test17_SortablesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/sortable.html");
		System.out.println("Browser got launched");
		
		List<WebElement> List = driver.findElements(By.xpath("//ul[@id='sortable']/li"));
		
		WebElement from = List.get(6);
		WebElement To = List.get(0);
		
		/*Actions actions = new Actions(driver);
		actions.clickAndHold(from);
		actions.moveToElement(To);
		actions.release(To);
		actions.build().perform();*/

		
		Actions action = new Actions(driver);
		action.clickAndHold(from).moveToElement(To).release(To).build().perform();
		System.out.println("Sortable Done...!");
	}

}
