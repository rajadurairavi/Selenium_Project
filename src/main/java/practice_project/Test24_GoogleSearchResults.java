package practice_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test24_GoogleSearchResults {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Nature");

		Thread.sleep(5000);

		List<WebElement> results = driver.findElements(By.xpath("//ul[@role='listbox']//following::li"));

		// Print all the suggestions 
		/*for (WebElement webElement : results) {  

			System.out.println(webElement.getText());	
		}*/

		//Print the required position of a search suggestions

		/*int postion = 0;
		for (WebElement webElement : results) {
			postion++;
			System.out.println(webElement.getText());
			if (postion==3) {
				webElement.click();
				break;
			}


		}
		 */		

		//print the required value/text of a search suggestions
		
		for (WebElement webElement : results) {
			
			String text = webElement.getText();
			System.out.println(text);
			
			if (text.contains("quotes")) {
				webElement.click();
				break;
				
			}
			
		}
		
		//print all the links in the search results page
		Thread.sleep(2000);
		
		List<WebElement>allLinks = driver.findElements(By.xpath("//a"));
		for (WebElement links : allLinks) {
			
			String Linkss = links.getAttribute("href");
			
			System.out.println(Linkss);
		}
		
		
		

		driver.quit();

	}

}
