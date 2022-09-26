package popupandalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Alert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://demo.guru99.com/test/delete_customer.php");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("55560");					
        driver.findElement(By.xpath("//input[@name='submit']")).submit();	
        
        // Switching to Alert        
     	Alert alert = driver.switchTo().alert();
     	
       // Capturing alert message.    
          String alertMess = driver.switchTo().alert().getText();		
       
        // Displaying alert message		
        System.out.println(alertMess);	
        Thread.sleep(5000);
        		
        // Accepting alert		
        alert.accept();	
	}

}
