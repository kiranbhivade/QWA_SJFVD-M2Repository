package Popups;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebbasedPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoapps.qspiders.com/fileUpload?sublist=0");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Custom Button']")).click();
		
		driver.findElement(By.xpath("//div[text()='Upload File']")).click();
		Runtime.getRuntime().exec("./AutoIT/FileUpload.exe");



	}

}
