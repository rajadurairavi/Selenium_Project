package practice_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Test19_CrossBrowserTesting {
	public static WebDriver driver;
	@Parameters("browser")
	@BeforeTest
	public void SetBrowser(String browser) {
		if (browser.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
			System.out.println("ChromeBrowser launched succesfully");
		}

		else if (browser.equalsIgnoreCase("ie")) {
			driver = new InternetExplorerDriver();
			System.out.println("InternetExplorer launched succesfully");
		}
	}
	@Test
	public void launchGooglePage() throws Exception {
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		System.out.println("Google page launch succesfully");
	}

	@AfterTest
	public void closeTest() {
		driver.quit();
		System.out.println("CrossBrowser Testing Succesfully completed");
	}


}
