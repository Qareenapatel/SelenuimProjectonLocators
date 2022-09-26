package popupandalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopUp_Alert2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("http://the-internet.herokuapp.com/");

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[contains(text(),'Basic Auth')]")).click();

	}

}
