package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Kiran");
		driver.findElement(By.id("LastName")).sendKeys("Bhivade");
		driver.findElement(By.id("Email")).sendKeys("kiranbhivade@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("kiran@12345");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("kiran@12345");
		driver.findElement(By.id("register-button")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.className("email")).sendKeys("kiranbhivade@gmail.com");
		driver.findElement(By.className("password")).sendKeys("kiran@12345");
		driver.findElement(By.className("login-button")).click();
		//driver.findElement(By.cssSelector("[class='login-button']")).click();
		
		Thread.sleep(2000);
		driver.quit();

		

	}

}
