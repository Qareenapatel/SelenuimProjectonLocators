package googlesearch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.ca/");

		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("javatpoint");

		Thread.sleep(2000);

		List<WebElement> list = driver
				.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='eIPGRd']"));
		System.out.println(list.size());

		Thread.sleep(2000);

		for (int i = 0; i < list.size(); i++) {
			String listitem = list.get(i).getText();
			System.out.println(listitem);
			if (listitem.contains("javatpoint interview questions")) {
				list.get(i).click();
				break;
			}
		}

	}

}
