package mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseRightAndDoubleClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();

		/*WebElement button = driver.findElement(By.xpath("//b[text()='Directory']"));
		
		Actions act = new Actions(driver);
		act.contextClick(button).perform();//right click action*/
		
		WebElement button1 = driver.findElement(By.xpath("//b[text()='Recruitment']"));
				
		Actions act = new Actions(driver);
		Thread.sleep(1500);
		act.doubleClick(button1).perform();//double click action*/

		
	}

}
