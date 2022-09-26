package keyboardevents;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvents2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.facebook.com/r.php");

		driver.manage().window().maximize();
	
			
		WebElement textuser=driver.findElement(By.name("firstname"));
		
		Actions builder = new Actions(driver);
		
		Action seriesOfActions = 
				builder.moveToElement(textuser).click().keyDown(textuser, Keys.SHIFT).sendKeys(textuser, "hello")
				.keyUp(textuser, Keys.SHIFT).doubleClick(textuser).contextClick().build();
				
			seriesOfActions.perform() ;
		
		
		

	}

}
