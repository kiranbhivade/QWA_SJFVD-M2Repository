package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QspidersDemoAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();
		
		driver.findElement(By.xpath("//input[@name='requiredfield']")).sendKeys("hello");
		
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("kiran@1234");
	
		driver.findElement(By.xpath("//input[@placeholder='Re-Type Password']")).sendKeys("kiran@1234");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter a valid e-mail']")).sendKeys("kiranbhivade@gmail.com");
	
		driver.findElement(By.xpath("//input[@placeholder='URL']")).sendKeys("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter only digits']")).sendKeys("1234567890");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter only numbers']")).sendKeys("098765432");
		
		driver.findElement(By.xpath("//input[@placeholder='Enter alphanumeric value']")).sendKeys("demo1234");

		driver.findElement(By.xpath("//input[@placeholder='Min 6 chars.']")).sendKeys("kiranbb");

		driver.findElement(By.xpath("//input[@placeholder='Max 6 chars.']")).sendKeys("kiran");
	
		driver.findElement(By.xpath("//input[@placeholder='Text between 5 - 10 chars length']")).sendKeys("helloworld");
		
		driver.findElement(By.xpath("//input[@placeholder='Min value is 6']")).sendKeys("9");
		
		driver.findElement(By.xpath("//input[@placeholder='Max value is 6']")).sendKeys("5");
		
		driver.findElement(By.xpath("//input[@placeholder='Number between 6 - 100']")).sendKeys("8");
		
		WebElement submitbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		submitbutton.submit();
	
		
		}

}
