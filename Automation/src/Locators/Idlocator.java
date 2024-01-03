package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Idlocator {
         public static void main(String[] args) {
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("kiranbhivade@gmail.com");
			driver.findElement(By.id("pass")).sendKeys("1234567890");
			//driver.findElement(By.id("u_0_5_kS"));
		}
}
