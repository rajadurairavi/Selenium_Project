package practice_project;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test01_ButtonExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println("Browser got launched");
		
	    //Find Position of the WebElement (Point)
		WebElement Position = driver.findElement(By.xpath("//button[@id='position']"));
		Point point = Position.getLocation();
		int xposition = point.getX();
		int yposition = point.getY();
		System.out.println("X-Position Value is "+ xposition+" Y-Position Value is "+yposition);
		
		//Find Button Background Color
		WebElement Color = driver.findElement(By.xpath("//button[@id='color']"));
		String ButtonColour = Color.getCssValue("background-color");
		System.out.println("Button Colour is "+ButtonColour);
		
		//Find WebElement Size
		WebElement Size = driver.findElement(By.xpath("//button[@id='size']"));
		int height = Size.getSize().getHeight();
		int width = Size.getSize().getWidth();
		System.out.println("Height is "+height+" Width is "+width);
		
		//Click on WebElement
		WebElement ButtonClick = driver.findElement(By.xpath("//button[@id='home']"));
		ButtonClick.click();
		
		driver.quit();
		
	}

}
