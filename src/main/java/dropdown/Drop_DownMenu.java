package dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_DownMenu {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		Thread.sleep(1500);

		driver.findElement(By.xpath("//b[text()='Recruitment']")).click();
		Thread.sleep(1500);
		Select sc = new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_jobTitle']")));
		sc.selectByVisibleText("BTest");

		Thread.sleep(1500);

		Select sc1 = new Select(driver.findElement(By.xpath("//select[@id='candidateSearch_status']")));
		sc1.selectByIndex(4);
		Thread.sleep(1500);
		driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		Thread.sleep(2500);
		
		

	}

}
