package practice_project;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15_DynamicTablesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/table.html");
		System.out.println("Browser got launched");
		
		//Get the number of columns
		
		List<WebElement> Colums = driver.findElements(By.tagName("th"));
		int ColumnsCount = Colums.size();
		System.out.println(ColumnsCount);
		
		//Get the number of rows
		
		List<WebElement> rows = driver.findElements(By.tagName("tr"));
		int rowsCount = rows.size();
		System.out.println(rowsCount);
		
	}

}
