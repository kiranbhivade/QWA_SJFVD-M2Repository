package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("https://demoapps.qspiders.com/alert?sublist=0");
		d.findElement(By.xpath("//a[text()='Confirm']")).click();
		d.findElement(By.id("buttonAlert5")).click();
		
		Alert alt=d.switchTo().alert();
		alt.dismiss();
		Thread.sleep(2000);
		d.quit();
	}

}
