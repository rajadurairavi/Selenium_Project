package practice_project;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test04_LinksExamples {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		System.out.println("Browser got launched");
		
		WebElement linkText1 = driver.findElement(By.linkText("Go to Home Page"));
		linkText1.click();
		
		driver.navigate().back();
		
		WebElement PartialLinkText = driver.findElement(By.partialLinkText("Home Page"));
		PartialLinkText.click();	
		
		driver.navigate().back();
		
		//Find where am supposed to go without clicking me?
		WebElement findwhere = driver.findElement(By.partialLinkText("Find where"));
		String where = findwhere.getAttribute("href");
		System.out.println(where);
		
		WebElement BrokenLink = driver.findElement(By.partialLinkText("Verify am"));
		BrokenLink.click();
		
		String title = driver.getTitle();
		if (title.contains("404")) {
			
			System.out.println("The Link is broken");
		}else {
			System.out.println("The Link is not broken");
		}
		
		driver.navigate().back();
		
		List<WebElement> AllLinks = driver.findElements(By.tagName("a"));
		int LinksCount = AllLinks.size();
		
		System.out.println(LinksCount);
		
		driver.quit();
		
	}

}
