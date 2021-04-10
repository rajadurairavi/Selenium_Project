package practice_project;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11_AutoCompleteExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/autoComplete.html");
		System.out.println("Browser got launched");
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		WebElement AutocomList = driver.findElement(By.xpath("//input[@id='tags']"));
		AutocomList.sendKeys("S");
		List<WebElement> AllValues = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(AllValues.size());
		
		
		// ForEach loop to select a perticular Value

				for (WebElement webElement : AllValues) {
					
					if (webElement.getText().equalsIgnoreCase("soap")) {
						webElement.click();
						break;
					}else {
						System.out.println("Else block");
					}
				}
		
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='tags']")).sendKeys("S");
		
		List<WebElement> getAllValues = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li"));
		System.out.println(getAllValues.size());
		
		// Action class to select a perticular value
		Actions action = new Actions(driver);
		action.click(getAllValues.get(3)).build().perform();
			
	}

}
