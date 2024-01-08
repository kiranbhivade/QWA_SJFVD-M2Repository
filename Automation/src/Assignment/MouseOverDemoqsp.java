package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOverDemoqsp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/button/buttonRightClick?sublist=1");

		Actions act = new Actions(driver);

		act.contextClick(driver.findElement(By.id("btn30"))).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		act.contextClick(driver.findElement(By.xpath("//button[@id='btn31']"))).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		act.contextClick(driver.findElement(By.xpath("//button[@id='btn32']"))).perform();
		driver.findElement(By.xpath("//div[text()='5']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
