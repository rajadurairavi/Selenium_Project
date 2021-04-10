package practice_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test07_FramesExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/frame.html");
		System.out.println("Browser got launched");
		
		//normal iframe
		driver.switchTo().frame(0);
		
		WebElement frame1 = driver.findElement(By.xpath("//button[@id='Click']"));
		frame1.click();	
		
		String text =driver.findElement(By.xpath("//button[@id='Click']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		//Nested frame
		driver.switchTo().frame(1);
		driver.switchTo().frame("frame2");
		WebElement frame2 = driver.findElement(By.xpath("//button[@id='Click1']"));
		frame2.click();
		
		driver.switchTo().defaultContent();
		
		//Total number of frames
		
		int framecount = driver.findElements(By.tagName("iframe")).size();
		System.out.println(framecount);
		
		driver.quit();
	}

}
