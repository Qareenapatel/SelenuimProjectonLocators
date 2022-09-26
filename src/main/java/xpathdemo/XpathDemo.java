package xpathdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://accounts.google.com/signup/v2/webcreateaccount?flowName=GlifWebSignIn&flowEntry=SignUp");

		driver.manage().window().maximize();

		//Absolute Xpath
		//driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/span[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("Richa");
		
		//Relative Xpath
		//driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Richa");
		
		//or
		driver.findElement(By.xpath("//input[@id='firstName1' or @name='firstName']")).sendKeys("Richa");
		//and
		driver.findElement(By.xpath("//input[@id='firstName1' and @name='firstName']")).sendKeys("Richa");

		
		/*driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Shah");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Richashah012345");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='Passwd']")).sendKeys("Richa45678");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='ConfirmPasswd']")).sendKeys("Richa45678");
		
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();*/

		
		
	}
}
