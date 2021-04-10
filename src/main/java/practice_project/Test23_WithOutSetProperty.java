package practice_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test23_WithOutSetProperty {
	

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		//***** Just need to set Chrome driver path in environment system variable to exclude setProperty.

		
		// Maximize ways on chrome options
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeOptions);
		//driver.manage().window().maximize();
		
		
		// Authentication via URL examples
		
		/*driver.get("http://the-internet.herokuapp.com/basic_auth");
		//driver.get(http://Username:Password@pageURL) 
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");*/
		
		
		// Refresh ways
		
		/*driver.navigate().refresh();
		driver.get(driver.getCurrentUrl());*/
		
		
		
		driver.get("https://www.google.com/");
		String title = driver.getTitle();

		if (title.equalsIgnoreCase("Google")) {

			System.out.println("TestCase got passed");

		} else {

			System.out.println("Testcase got failed");

		}


		driver.quit();
	}

}
