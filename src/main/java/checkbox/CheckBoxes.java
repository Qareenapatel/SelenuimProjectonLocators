package checkbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		driver.findElement(By.xpath("//b[text()='Admin']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_18']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_10'][@value='10']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_17']")).click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_37'][@value='37']")).click();
		Thread.sleep(2000);

		WebElement option1 = driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectRecord_34']"));
				
        option1.click();			

        // Check whether the Check box is toggled on 		
        if (option1.isSelected()) {					
            System.out.println("Checkbox is Toggled On");					

        } else {			
            System.out.println("Checkbox is Toggled Off");					
        }		
         

	}

}
