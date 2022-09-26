package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Dynamic {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_admin_viewAdminModule']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']")).click();
		driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']")).click();
		
		Thread.sleep(10000);
		int rowcount = driver.findElements(By.xpath("//table/tbody/tr")).size();
		System.out.println(rowcount);
		
		int statuscount=0;
		
		for (int i=1;i<=rowcount;i++)
		{
			String status = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[5]")).getText();
		
			if (status.equals("Enabled"))
			{
				statuscount = statuscount+1;
			}
		}
		System.out.println("No.of employees Enabled:" + statuscount );
		
		
	}

}
