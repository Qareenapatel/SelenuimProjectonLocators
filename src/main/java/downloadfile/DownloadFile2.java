package downloadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        
        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

        Thread.sleep(1500);
		driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//input[@value='19_1']")).click();
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Download']")).click();

		

      
        
        
		
	}

}
