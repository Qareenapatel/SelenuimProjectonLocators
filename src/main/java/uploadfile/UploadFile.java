 package uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        
        driver.get("https://www.monsterindia.com/");
        Thread.sleep(1500);
        
        driver.findElement(By.xpath("//span[text()='Upload Resume']")).click();
        Thread.sleep(2500);
        //in inspect element when type=file is exist then we can use directly sendkeys() method
        driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("C:\\Seleniumpackage\\sample.pdf");
        
      // Submit per click nathi karavyu
        
        
        
        
	}

}
