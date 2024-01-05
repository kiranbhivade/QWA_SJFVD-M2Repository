package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookRegister {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@ajaxify='/reg/spotlight/']")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kiran");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Bhivade");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("kiranbhivade@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("kiranbhivade@gmail.com");
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("kiran@1234");
	    WebElement d=driver.findElement(By.id("day"));
	   Select s =new Select(d);
	   s.selectByValue("12");
	   WebElement d1=driver.findElement(By.id("month"));
	   Select s1=new Select(d1);
	   s1.selectByValue("8");
	   WebElement d2=driver.findElement(By.id("year"));
	   Select s2=new Select(d2);
	   s2.selectByValue("2000");
	   driver.findElement(By.name("sex")).click();
	   driver.findElement(By.xpath("//button[@name='websubmit']")).click();
	  
	}

}
