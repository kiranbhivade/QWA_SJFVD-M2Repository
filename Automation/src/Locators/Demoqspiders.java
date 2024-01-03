package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqspiders {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		Thread.sleep(1000);
		driver.findElement(By.id("name")).sendKeys("Kiran Bhivade");
		driver.findElement(By.id("email")).sendKeys("kiranbhivade@gmail.com");
		driver.findElement(By.id("password")).sendKeys("kiran@12345");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		
		

	}

}
