package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.google.common.io.Files;

public class IRCTC {
	public static void main(String[] args) throws IOException, InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://www.irctc.co.in/nget/train-search");
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[1]")).sendKeys("Mumbai");
		driver.findElement(By.xpath("//span[text()=' MUMBAI CENTRAL - MMCT ']")).click();
		
		driver.findElement(By.xpath("(//input[@role='searchbox'])[2]")).sendKeys("Lonavala");
		driver.findElement(By.xpath("//span[text()=' LONAVALA - LNL ']")).click();
		
		driver.findElement(By.xpath("//p-calendar[@dateformat='dd/mm/yy']")).click();
		driver.findElement(By.xpath("//a[text()='29']")).click();
		
        driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[1]")).click();
        driver.findElement(By.xpath("//span[text()='AC First Class (1A) ']")).click();
        
        driver.findElement(By.xpath("(//div[@aria-haspopup='listbox'])[2]")).click();
        driver.findElement(By.xpath("//span[text()='LADIES']")).click();
        
        driver.findElement(By.xpath("//button[@label='Find Trains']")).click();
        
        Thread.sleep(5000);
        TakesScreenshot ts=(TakesScreenshot) driver;
        File src=ts.getScreenshotAs(OutputType.FILE);
        File dest=new File("./screenshot/irctc.png");
        Files.copy(src, dest);
        
        driver.quit();
        
		
		
	}

}
