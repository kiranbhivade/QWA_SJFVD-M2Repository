package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GoogleInspectForloop {
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		Actions act=new Actions(driver);
		act.contextClick().perform();
		Robot r=new Robot();
		for(int i=0;i<10;i++)
		{
			r.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
		}
		r.keyPress(KeyEvent.VK_ENTER);
	}

}
