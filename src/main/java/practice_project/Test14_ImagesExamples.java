package practice_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14_ImagesExamples {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		System.out.println("Browser got launched");
		
		/*WebElement image1 = driver.findElement(By.xpath("//section/div[1]/div/div/img"));
		image1.click();*/
	
		//Brocken Image
		
		WebElement BrokenImage = driver.findElement(By.xpath("//section/div[2]/div/div/img"));
		if (BrokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("The Image is broken");
		}
		else {
			System.out.println("Image is not broken");
		}

	}

}
