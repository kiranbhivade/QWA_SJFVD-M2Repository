package Assignment;

import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class YatraAppAssignment {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.yatra.com/");
		driver.findElement(By.xpath("//li[@class='initial-tab flex1 safariFix__field']")).click();
		driver.findElement(By.xpath("//p[text()='Chhatrapati Shivaji International']")).click();
		driver.findElement(By.xpath("//p[text()='Shamshabad Rajiv Gandhi']")).click();
		driver.findElement(By.xpath("//span[text()='Departure Date']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("25/01/2024")).click();
		
		Thread.sleep(2000);
		driver.quit();
		}

}
