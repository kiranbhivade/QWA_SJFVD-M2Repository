package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAss {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung s24",Keys.ENTER);
		driver.findElement(By.xpath("//img[@alt='Sponsored Ad - Samsung Galaxy S24 Plus 5G (Cobalt Violet, 12GB, 512GB Storage)']")).click();
		
		Set<String> id=driver.getWindowHandles();
		for(String Id:id)
		{
			driver.switchTo().window(Id);
			if(driver.getCurrentUrl().equals("https://www.amazon.in/Samsung-Galaxy-Cobalt-Violet-Storage/dp/B0CS6DTNH8/ref=sr_1_1_sspa?keywords=Samsung%2Bs24&qid=1706268720&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&th=1"))
			{
				break;
			}
		 
		}
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
	    driver.findElement(By.xpath("//span[text()='Add to Cart']")).click();
	    driver.quit();
		
	}
	
}
