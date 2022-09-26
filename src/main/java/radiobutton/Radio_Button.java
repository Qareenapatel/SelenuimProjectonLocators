package radiobutton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio_Button {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ritu");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Radiya");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Rirad1245");
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("ritur1278$");
		
		Thread.sleep(2000);	
		
        WebElement radio1 = driver.findElement(By.xpath("//input[@value='1']"));							
        WebElement radio2 = driver.findElement(By.xpath("//input[@value='2']"));	
        WebElement radio3 = driver.findElement(By.xpath("//input[@value='-1']"));	

    	Thread.sleep(2000);			
        //Radio Button1 is selected		
        //radio1.click();			
       // System.out.println("Radio Button Option 1 Selected");					
        		
        //Radio Button1 is de-selected and Radio Button2 is selected		
       // radio2.click();			
       // System.out.println("Radio Button Option 2 Selected");	
        
      //Radio Button2 is de-selected and Radio Button3 is selected		
        radio3.click();			
        System.out.println("Radio Button Option 3 Selected");	

	}

}
