package Popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPromptPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver g=new ChromeDriver();
		g.manage().window().maximize();
		g.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));;
		//g.get("https://demoapps.qspiders.com/alert?sublist=0");
		g.get("https://demoapps.qspiders.com/alert/prompt?sublist=2");
		Thread.sleep(2000);
		//g.findElement(By.id("//a[text()='Prompt']")).click();
		g.findElement(By.id("buttonAlert1")).click();
		
		Alert alt=g.switchTo().alert();
		Thread.sleep(2000);
		alt.sendKeys("yes");
		Thread.sleep(2000);
		System.out.println(alt.getText());
		alt.accept();
		Thread.sleep(2000);
		g.quit();s
	}

}
