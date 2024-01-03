package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagramlocator {
	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		driver.findElement(By.name("username")).sendKeys("kiranbhivade5");
		driver.findElement(By.name("password")).sendKeys("Kiran@1234");

		driver.findElement(By.className("_acap")).click();
		
		String actualtitle=driver.getTitle();	
		System.out.println(actualtitle);
		Thread.sleep(1000);
	    driver.quit();
		
	}

}
