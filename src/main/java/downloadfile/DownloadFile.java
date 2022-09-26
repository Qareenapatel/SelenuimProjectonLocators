package downloadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DownloadFile {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\patel\\Webdriver\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.manage().window().maximize();
        
        
        driver.get("http://demo.automationtesting.in/FileDownload.html");
        Thread.sleep(1500);
        
        //download pdf file
       /*driver.findElement(By.xpath("//textarea[@id='pdfbox']")).sendKeys("testing pdf file");
        Thread.sleep(1500);
      
        driver.findElement(By.xpath("//button[@id='createPdf']")).click();
        Thread.sleep(1500);
        
        driver.findElement(By.xpath("//a[@id='pdf-link-to-download']")).click();// display download and click
        Thread.sleep(1500);*/
        
        
        //download text file
        driver.findElement(By.xpath("//textarea[@id='textbox']")).sendKeys("testing text file");
        Thread.sleep(2500);
      
        driver.findElement(By.xpath("//button[@id='createTxt']")).click();
        Thread.sleep(2500);
        
        driver.findElement(By.xpath("//a[@download='info.txt']")).click();// display download and click
        Thread.sleep(1500);
           
        
        
        
       
		
	}

}
