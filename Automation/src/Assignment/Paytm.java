package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Paytm {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://paytm.com/");
		WebElement ele=driver.findElement(By.xpath("//div[@class='_2EGQY'][2]"));
		JavascriptExecutor js= (JavascriptExecutor) driver;
	
		js.executeScript("arguments[0].scrollIntoView(false)",ele);
		ele.click();
		
		driver.findElement(By.xpath("//span[@id='srcCode']")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.xpath("//input[@id='text-box']")).sendKeys("Pune");
		driver.findElement(By.xpath("//div[text()='Pune, Maharashtra, India']")).click();
		
		
		driver.findElement(By.xpath("//span[@id='destCode']")).click();
		driver.findElement(By.xpath("//img[@class='_3i2Wp']")).click();
		driver.findElement(By.xpath("//input[@id='text-box']")).sendKeys("Jaipur");
		driver.findElement(By.xpath("//div[text()='Jaipur, Rajasthan, India']")).click();
		
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		driver.findElement(By.xpath("(//div[text()='25'])[1]")).click();
		
		driver.findElement(By.xpath("//span[@class='_2HtkP']")).click();
		for(int i=0;i<2;i++)
		{
		    driver.findElement(By.xpath("(//img[@alt='add-icon'])[1]")).click();
		}
		driver.findElement(By.xpath("//button[@id='flightSearch']")).click();
		
		List<WebElement> allflight=driver.findElements(By.xpath("//div[@class='_5Cbbf']"));
		
		for(WebElement flight:allflight)
		{
			System.out.println(flight.getText());
		}
		
	 
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/paytm.png");
		Files.copy(src, dest);
		
		driver.findElement(By.xpath("(//div[@class='_1zafZ'])[1]")).click();
		Thread.sleep(2000);
		driver.quit();
		
	
 
		
		
		
		
		
	
	}

}
