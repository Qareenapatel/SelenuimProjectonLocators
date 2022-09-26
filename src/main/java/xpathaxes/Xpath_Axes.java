package xpathaxes;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Axes {

	public static void main(String[] args) throws InterruptedException {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.navigate().to("https://money.rediff.com/gainers/bse/daily");

			driver.manage().window().maximize();
		
		
			Thread.sleep(2000);
			//self
			String text = driver.findElement(By.xpath("//a[contains(text(),'Silver Oak (India)')]/self::a")).getText();
			System.out.println(text);
			
			//parent
			text = driver.findElement(By.xpath("//a[contains(text(),'Silver Oak (India)')]/parent::td")).getText();
			System.out.println(text);
			
			//child
			List<WebElement> childs= driver.findElements(By.xpath("//a[contains(text(),'Silver Oak (India)')]/ancestor::tr/child::td"));
			System.out.println("Number of child elements: "+childs.size());
			
			//ancestor
			text = driver.findElement(By.xpath("//a[contains(text(),'Silver Oak (India)')]/ancestor::tr")).getText();
			System.out.println(text);
			
			//Descendant
			List<WebElement> descendants = driver.findElements(By.xpath("//a[contains(text(),'Silver Oak (India)')]/ancestor::tr/descendant::*"));
			System.out.println("Number of descendant nodes:" + descendants.size());
			
			//following
			List<WebElement> following = driver.findElements(By.xpath("//a[contains(text(),'Silver Oak (India)')]/ancestor::tr/following::tr"));
			System.out.println("Number of following nodes:" + following.size());
			
			//following-siblings
			List<WebElement> followingsiblings = driver.findElements(By.xpath("//a[contains(text(),'Silver Oak (India)')]/ancestor::tr/following-sibling::tr"));
			System.out.println("Number of following-siblings nodes:" + followingsiblings.size());
			

			//preceding
			List<WebElement> preceding = driver.findElements(By.xpath("//a[contains(text(),'Silver Oak (India)')]/ancestor::tr/preceding::tr"));
			System.out.println("Number of preceding nodes:" + preceding.size());
			
			//preceding-siblings
			List<WebElement> precedingsibling = driver.findElements(By.xpath("//a[contains(text(),'Silver Oak (India)')]/ancestor::tr/preceding-sibling::tr"));
			System.out.println("Number of preceding-sibling nodes:" + precedingsibling.size());
			
			
			
	}

}
