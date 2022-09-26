package cssLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//Tag and Id
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("Reena@yahoo.com");
		
		//Tag and attribute
		
		//driver.findElement(By.cssSelector("input[data-testid='royal_pass']")).sendKeys("Re123435668");

		//Tag, class and attributes
		
	driver.findElement(By.cssSelector("input.inputtext[data-testid='royal_pass']")).sendKeys("Re123435668");
		
		

		//driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).click();
        driver.findElement(By.xpath("//button[@name='login']")).click();
		
		
	}

}
