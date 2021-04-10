package practice_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test02_TextBoxExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
				
		//Enter a value in textbox
		WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='email']"));
		EnterEmail.sendKeys("rajaduraivijay@gmail.com");
		
		//Appened a value in textbox
		WebElement Append = driver.findElement(By.xpath("//input[@value='Append ']"));
		Append.sendKeys("Value");
		
		//Get Attribute Value in textbox
		WebElement GetText = driver.findElement(By.xpath("(//input[@name='username'])[1]"));
		String love = GetText.getAttribute("value");
		System.out.println(love);

		//textbox enabled or disabled
		WebElement Status = driver.findElement(By.xpath("//*[@id=\'contentblock\']/section/div[5]/div/div/input"));
		boolean enabled = Status.isEnabled();
		System.out.println(enabled);
		
		
		driver.quit();
		
	}

}
