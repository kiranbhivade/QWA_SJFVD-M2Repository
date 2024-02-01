package FrameHandling;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.dream11.com/");
		
		driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("//input[@name='regEmail']")).sendKeys("1234567");
		driver.findElement(By.xpath("//a[@id='regUser']")).click();
	}

}
