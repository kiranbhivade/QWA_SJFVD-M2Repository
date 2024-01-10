package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.navigate().to("https://demoapps.qspiders.com/button/buttonDoubleClick?sublist=2");
		Actions act = new Actions(driver);
		
		WebElement s = driver.findElement(By.id("btn20"));
		act.doubleClick(s).perform();

		WebElement s1 = driver.findElement(By.id("btn23"));
		act.doubleClick(s1).perform();

		WebElement s2 = driver.findElement(By.id("btn25"));
		act.doubleClick(s2).perform();

		Thread.sleep(2000);
		driver.quit();
	}

}
