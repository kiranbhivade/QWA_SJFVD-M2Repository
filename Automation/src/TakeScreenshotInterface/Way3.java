package TakeScreenshotInterface;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class Way3 {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//span[@class='deny-btn']")).click();
		Actions act=new Actions(driver);
        WebElement coin=driver.findElement(By.xpath("//a[@title='Coins']"));
        act.moveToElement(coin).perform();
        driver.findElement(By.xpath("//span[text()='Coins by Design']")).click();
        driver.findElement(By.xpath("//img[@alt='50 gram 24 KT Lakshmi Gold Coin']")).click();
		RemoteWebDriver rwd=(RemoteWebDriver)driver;
		Thread.sleep(2000);
		File src=rwd.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/gold.png");
		Files.copy(src, dest);
	}

}
