package learningTestNG;

import java.util.Random;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CreateUserUsingAnnotations extends BaseTest{
	@Test
	public void cresteUser() throws InterruptedException
	{

		Random r=new Random();
		int rm=r.nextInt(100)+1;
		driver.findElement(By.xpath("//a[@class='content users']")).click();
		driver.findElement(By.xpath("//input[@value='Create New User']")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("KBB"+rm);
        driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("kiran1234");
        driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("kiran1234");
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Sanskruti");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Chopra"+rm);
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='overtimeTracking']")).click();
        driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
		Reporter.log("User Created Successfully");
	}

}
