package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemoQsp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.navigate().to("https://demoapps.qspiders.com/?scenario=1");
		
		driver.findElement(By.xpath("//section[text()='Mouse Actions']")).click();
		driver.findElement(By.xpath("//section[text()='Drag & Drop']")).click();
		driver.findElement(By.xpath("//a[text()='Drag Position']")).click();
		
		WebElement drag=driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement drop=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag,drop).perform();
		
		
		WebElement drag1=driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement drop1=driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		act.dragAndDrop(drag1, drop1).perform();
	
		
		WebElement drag2=driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement drop2=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(drag2, drop2).perform();
		
		
		WebElement drag3=driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement drop3=driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		act.dragAndDrop(drag3, drop3).perform();
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
