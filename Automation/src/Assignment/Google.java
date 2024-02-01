package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.xpath("//a[@class='gb_d']")).click();

		driver.switchTo().frame("app");
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		
		driver.close();
	}

}
