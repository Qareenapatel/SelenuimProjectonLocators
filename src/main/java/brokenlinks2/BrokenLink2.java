package brokenlinks2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink2 {

	public static void main(String[] args) throws IOException, InterruptedException {

		// Initiate driver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		// maximize the page
		driver.manage().window().maximize();

		// open URL on app
		driver.navigate().to("https://www.linkedin.com/home");

		// capture links from webpage
		List<WebElement> links = driver.findElements(By.tagName("a"));

		// Number of links
		System.out.println(links.size());

		
		for (int i = 0; i < links.size(); i++) {

			// by using href attributr we can get URL of required link

			WebElement element = links.get(i);
			String url = element.getAttribute("href");

			URL link = new URL(url);

			// create connection using url object 'link'
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();

			Thread.sleep(2000);
			
			// establish connection
			httpConn.connect();

			int respcode = httpConn.getResponseCode(); // return response if resp code is above 400: broken link

			if (respcode >= 400) {
				System.out.println(url + " : is broken link");
			} else {
				System.out.println(url + " : is valid link");
			}

		}

	}

}
