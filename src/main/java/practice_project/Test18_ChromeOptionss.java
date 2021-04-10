package practice_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Test18_ChromeOptionss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--start-maximized");  //Browser maximized
		options.addArguments("-incognito");  //Browser incognito mode
		options.addArguments("--disable-infobars");//chrome is controlled by automated software bar
		options.addArguments("--headless");// headless browser 

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://www.google.com");
		System.out.println("Page title is "+ driver.getTitle());
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("google")) {

			System.out.println("PASSED: Google page launched succesfully");

		} else {

			System.out.println("FAILED : Google page was not launched as expected");
		}


		driver.quit();
	}

}
