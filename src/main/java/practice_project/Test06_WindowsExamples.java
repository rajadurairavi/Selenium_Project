package practice_project;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test06_WindowsExamples {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Window.html");
		System.out.println("Browser got launched");
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		//Store ParentWindow
		String ParentWindow = driver.getWindowHandle();
		WebElement HomepageButton = driver.findElement(By.xpath("//button[text()='Open Home Page']"));
		HomepageButton.click();
		
		//Open ChildWindow
		Set<String>AllWindows = driver.getWindowHandles();
		
		for (String NextWindow : AllWindows) {
			
			driver.switchTo().window(NextWindow);
			
		}
		//Close ChildWindow
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//h5[text()='Edit']")).click();
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		
		WebElement OpenMultipleBrowsers = driver.findElement(By.xpath("//button[text()='Open Multiple Windows']"));
		OpenMultipleBrowsers.click();
		int windowscount = driver.getWindowHandles().size();
		System.out.println(windowscount);
		
		WebElement CloseMe = driver.findElement(By.xpath("//button[text()='Do not close me ']"));
		CloseMe.click();
		
		Set<String> NewAllWindows = driver.getWindowHandles();
		for (String newwindow : NewAllWindows) {
			if (!newwindow.equals(ParentWindow)) {
				driver.switchTo().window(newwindow);
				driver.close();
			}
		}
		
		driver.switchTo().window(ParentWindow);
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.quit();
	
	}

}


