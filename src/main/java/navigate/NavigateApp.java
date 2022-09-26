package navigate;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateApp {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        
        driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
        Thread.sleep(1500);
        System.out.println(driver.getTitle());
        
        driver.navigate().to("https://www.facebook.com/");
        System.out.println(driver.getTitle());
        Thread.sleep(1500);
        
        driver.navigate().back();
        System.out.println(driver.getTitle());
        Thread.sleep(1500);

        driver.navigate().forward();
        System.out.println(driver.getTitle());
        Thread.sleep(1500);

        driver.navigate().refresh();
        System.out.println(driver.getTitle());
        Thread.sleep(1500);

        driver.close();

        
	}

}
