package practice_project;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12_DownloadFilesExamples {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/download.html");
		System.out.println("Browser got launched");
		
		
		WebElement DownloadLink1 = driver.findElement(By.linkText("Download Excel"));
		DownloadLink1.click();
		Thread.sleep(3000);
		
		File filepath = new File("C:\\Users\\Rajadurai\\Downloads");
		File[] Allfiles = filepath.listFiles();
		
		for (File file : Allfiles) {
			
			if (file.getName().equals("testleaf.xlsx")) {
				
				System.out.println("File got download");
				
				break;
					
			}
			
		}
		
	}

}
