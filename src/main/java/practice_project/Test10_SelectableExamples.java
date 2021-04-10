package practice_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10_SelectableExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/selectable.html");
		System.out.println("Browser got launched");
		
		List<WebElement> SelectableTablec= driver.findElements(By.xpath("//ol[@id='selectable']/li"));
		int count = SelectableTablec.size();
		System.out.println(count);
		
		Actions action = new Actions(driver);
		
		//FirstWay
		
		/*action.keyDown(Keys.CONTROL)
		.click(SelectableTablec.get(0))
		.click(SelectableTablec.get(1))
		.click(SelectableTablec.get(2)).build().perform();*/
		
		//SecondWay
		
		action.clickAndHold(SelectableTablec.get(0))
		.clickAndHold(SelectableTablec.get(1))
		.clickAndHold(SelectableTablec.get(2)).build().perform();
		
		driver.quit();
		
	}

}
