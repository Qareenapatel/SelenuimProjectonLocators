package mouseevents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		

		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));	
		
		WebElement source1 = driver.findElement(By.xpath("//img[@src='images/high_tatras2_min.jpg']"));
		WebElement source2 = driver.findElement(By.xpath("//img[@src='images/high_tatras3_min.jpg']"));
		Thread.sleep(2500);
		WebElement target = driver.findElement(By.xpath("//div[@id='trash']"));		
		
		Actions act = new Actions(driver);
		Thread.sleep(1500);
		act.dragAndDrop(source1,target).perform();//drag and drop action*/

		act.dragAndDrop(source2,target).perform();
		
	}

}
