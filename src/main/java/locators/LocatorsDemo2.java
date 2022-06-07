package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsDemo2 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://automationpractice.com/index.php");

		// maximize web page
		driver.manage().window().maximize();

		// class
		int sliders = driver.findElements(By.className("homeslider-container")).size();
		System.out.println(sliders);

		// tag name
		int links = driver.findElements(By.tagName("a")).size();
		System.out.println(links);
	}
}
