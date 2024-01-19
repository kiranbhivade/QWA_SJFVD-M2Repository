package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ActiTimeScreenshot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver d=new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		d.get("http://laptop-kiran2/login.do");
		d.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		d.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		d.findElement(By.xpath("//a[text()='Login']")).click();
		
	    d.findElement(By.xpath("//a[@class='content users']")).click();
        d.findElement(By.xpath("//input[@value='Create New User']")).click();
        d.findElement(By.xpath("//input[@name='username']")).sendKeys("TestEngineer5");
        d.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("kiran1234");
        d.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("kiran1234");
        
        d.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Deepika");
        d.findElement(By.xpath("//input[@name='lastName']")).sendKeys("P");
        d.findElement(By.xpath("//input[@value='   Create User   ']")).click();
        d.findElement(By.xpath(" //a[text()='P, Deepika (TestEngineer5)']")).click();
        d.findElement(By.xpath("//input[@value='Delete This User']")).click();
        Thread.sleep(2000);
        TakesScreenshot ts = (TakesScreenshot)d;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshot/DeleteUser.png");
        Files.copy(src, dest);
        
        Thread.sleep(2000);
        d.quit();

		
	}

}
