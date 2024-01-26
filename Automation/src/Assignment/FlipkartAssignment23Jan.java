package Assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class FlipkartAssignment23Jan {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("iphone",Keys.ENTER);
	    driver.findElement(By.xpath("//div[text()='Apple iPhone 15 (Blue, 128 GB)']")).click();
	    
	    Set<String> all_id=driver.getWindowHandles();
	    for(String id:all_id)
	    {
	    	driver.switchTo().window(id);
	    	
	    	if(driver.getCurrentUrl().equals("https://www.flipkart.com/apple-iphone-15-blue-128-gb/p/itmbf14ef54f645d?pid=MOBGTAGPAQNVFZZY&lid=LSTMOBGTAGPAQNVFZZYSCIIOB&marketplace=FLIPKART&q=iphone&store=tyy%2F4io&spotlightTagId=BestsellerId_tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=3ec5fdea-0cf2-40d2-adc5-e16403eae5ae.MOBGTAGPAQNVFZZY.SEARCH&ppt=sp&ppn=sp&ssid=he9ze70w4w0000001706100463196&qH=0b3f45b266a97d70"))
	    			{
	    		              break;
	    			}
	    }
	    Thread.sleep(2000);
	    driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	    
	}

}
