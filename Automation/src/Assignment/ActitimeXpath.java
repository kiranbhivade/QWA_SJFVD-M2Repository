package Assignment;

import java.time.Duration;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class ActitimeXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-kiran2/login.do");
		//every time new customer name.
		Random r=new Random();
		int no=r.nextInt(2000);
		
		
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
	    driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
	    
	    driver.findElement(By.xpath("//a[text()='Login']")).click();
	
	    driver.findElement(By.xpath("//a[@class='content tasks']")).click();
	
        driver.findElement(By.xpath("//a[text()='Projects & Customers']")).click();  
     
        driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
     
        driver.findElement(By.xpath("//input[@name='name']")).sendKeys("HP1"+no);
        
        driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("this is hp project");
        
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        driver.findElement(By.xpath("//a[@href='/login.do']")).click();
        driver.quit();
        
        
	    
	    
	}

}
