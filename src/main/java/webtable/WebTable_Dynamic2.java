package webtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable_Dynamic2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/index.php/auth/login");

		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		driver.findElement(By.xpath("//b[text()='PIM']")).click();
		driver.findElement(By.xpath("//a[@id='menu_pim_viewEmployeeList']")).click();
		
		
		Thread.sleep(2000);
		int rowcount = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();
		System.out.println(rowcount);
		
			
		Thread.sleep(2000);
		int statuscount =0;
		for (int i=1;i<=rowcount;i++){
			
			for(int j=2;j<=4;j++)
				
		{
				
			String rowtext = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[" + j + "]")).getText();
			System.out.print(rowtext + "   ");
			statuscount =statuscount+1;
		
		}
			System.out.println();
			
		}
		
	}
}


	
	

