package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ancestorxpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Register']/ancestor::div[@class='header']")).click();
	}

}
// //div[@class='header']/descendant::a[text()='Register']
// //div[@class='header-links']/descendant::a[text()='Log in']--login