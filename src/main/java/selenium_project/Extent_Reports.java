package selenium_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Extent_Reports {


	static WebDriver driver;
	static ExtentReports ExtentReport = new ExtentReports("./ExtentReports/Google.html");
	static ExtentTest test = ExtentReport.startTest("Google Title Verify", "Verify the Google title");

	@BeforeTest
	public static void startTest() {

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Test
	public static void googleTitleVerify() {

		driver.get("https://www.google.com/");
		String title = driver.getTitle();

		test.log(LogStatus.INFO, "Driver is going to verify WebPage title");
		if (title.equals("Google")) {

			test.log(LogStatus.PASS, "Browser navigated to correct page");

			System.out.println("Title Verified and the Result is PASS");

		} else {
			test.log(LogStatus.FAIL, "Browser navigated to wrong page");

			System.out.println("Title Verified and the Result is FAIL");
		}
		test.log(LogStatus.INFO, "Driver is verified the Page title");


	}


	@AfterTest
	public static void endTest() {

		ExtentReport.endTest(test);
		ExtentReport.flush();
		driver.navigate().refresh();
		driver.quit();

	}

}
