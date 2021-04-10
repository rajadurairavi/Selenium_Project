package selenium_project;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class GooglePage extends BaseTest {

	@Test
	@Parameters({"TestData","Author"})
	//@Test(priority=6)

	public static void googleSearch(String TestData, String Author) throws InterruptedException, IOException, Exception{

		driver.get("https://www.google.com");
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys(TestData);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		System.out.println("Value Entered by"+ Author +"is : I Love Tiruvannamalai");

		TakesScreenshot ts = ((TakesScreenshot)driver);
		File screenshot = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File("C:\\Selenium\\ScreenShots\\GooglePage.jpeg"));
		System.out.println("TakeScreenShot class Screenshot has been taken");

		Robot robot = new Robot();
		java.awt.Dimension Screensize = Toolkit.getDefaultToolkit().getScreenSize();
		Rectangle rectangle = new Rectangle(Screensize);
		BufferedImage source = robot.createScreenCapture(rectangle);
		File destination = new File("C:\\Selenium\\ScreenShots\\Robot_Ss\\GooglePage.jpeg");
		ImageIO.write(source, "png", destination);
		System.out.println("robot class Screenshot has been taken");


	}


}
