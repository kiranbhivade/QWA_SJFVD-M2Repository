package Assignment;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class NetflixScreenShot {
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.netflix.com/in/");
		Thread.sleep(2000);
		WebElement signin=driver.findElement(By.xpath("//a[text()='Sign In']"));
		Thread.sleep(2000);//because execution is fast and screenshot is taken a bit earlier than expected
		
		//for screenshot of login button
		File src1=signin.getScreenshotAs(OutputType.FILE);
		File dest1=new File("./screenshot/signinbutton.png");
		Files.copy(src1, dest1);
	
		//for sign in
		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
		driver.findElement(By.xpath("//input[@autocomplete='email']")).sendKeys("kiranbhivade@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("kiran@1234");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		//for screenshot of page
		Thread.sleep(2000);
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/netflixassignment.png");
		Files.copy(src, dest);
		
		driver.quit();
		
		
	}

}
