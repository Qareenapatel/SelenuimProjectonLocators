package xpathdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXPath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.manage().window().maximize();

				
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Richa");
		
		//contains
		driver.findElement(By.xpath("//input[contains(@name,'lastName')]")).sendKeys("Shah");
		
		Thread.sleep(2000);
		//starts-with
		driver.findElement(By.xpath("//input[starts-with(@id,'username')]")).sendKeys("Richashah012345");
		Thread.sleep(2000);
		//last()
		
		//driver.findElement(By.xpath("//input[@name='Passwd'])[last()]")).sendKeys("Richa45678");

		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Richa45678");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Richa45678");
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		
		
		
				
	}
}
