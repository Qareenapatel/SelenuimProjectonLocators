package tooltip;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToolTip {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.globalsqa.com/demo-site/tooltip/");

		driver.manage().window().maximize();

		String expectedTooltip = "GlobalSQA";

		WebElement globe = driver.findElement(By.xpath("//a[@rel='home']"));

		String actualTooltip = globe.getAttribute("title");

		System.out.println("Actual Title of Tool Tip : " + actualTooltip);

		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Test Case Passed");
		}
		driver.close();

	}

}
