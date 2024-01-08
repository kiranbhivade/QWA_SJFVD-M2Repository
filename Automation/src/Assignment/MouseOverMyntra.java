package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverMyntra {
    public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		WebElement men=driver.findElement(By.xpath("//a[@data-reactid='21']/ancestor::div[@class='desktop-navContent']"));
		Actions a=new Actions(driver);
		a.moveToElement(men).perform();
		
		Thread.sleep(2000);
		
		driver.quit();
	}	

}
