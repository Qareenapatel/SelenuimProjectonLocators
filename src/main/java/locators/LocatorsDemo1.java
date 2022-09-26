package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		
		//Instantiate chromedriver class
		WebDriver driver = new ChromeDriver();
		// driver.get("http://automationpractice.com/index.php");
		driver.navigate().to("http://automationpractice.com/index.php");

		// maximize web page
		driver.manage().window().maximize();

		// Id locators
		// driver.findElement(By.id("search_query_top")).sendKeys("T-shirts");
		// or

		WebElement searchbox = driver.findElement(By.id("search_query_top"));
		searchbox.sendKeys("T-shirts");

		// name locators
		driver.findElement(By.name("submit_search")).click();

		// linkText and partialLinkText
		// driver.findElement(By.linkText("Printed Chiffon Dress")).click();
		driver.findElement(By.partialLinkText("Chiffon Dress")).click();

	}
}
