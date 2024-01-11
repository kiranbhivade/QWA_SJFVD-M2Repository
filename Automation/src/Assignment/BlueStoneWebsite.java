package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class BlueStoneWebsite {
	public static void main(String[] args) throws AWTException, IOException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Actions act=new Actions(driver);
        WebElement coin=driver.findElement(By.xpath("//a[@title='Coins']"));
        act.moveToElement(coin).perform();
        driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
        
       TakesScreenshot ts=(TakesScreenshot)driver;
       File src=ts.getScreenshotAs(OutputType.FILE);
       File dest=new File("./screenshot/bluestone.png");
       Files.copy(src,dest);
        driver.quit();		
	}

}
