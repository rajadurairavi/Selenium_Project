package selenium_project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
	public static WebDriver driver;
	
	@BeforeSuite
		public static void launchBrowser(){
			
	    	System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			
		}

	@AfterSuite
	    public static void closeBrowser(){
		
		driver.navigate().refresh();
		driver.quit();	
		
	}

}
