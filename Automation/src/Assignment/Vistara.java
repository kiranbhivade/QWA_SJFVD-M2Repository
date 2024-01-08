package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vistara {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-direct?gclid=CjwKCAiA1-6sBhAoEiwArqlGPoWz7UQl1RrjuP_vsio_OUcpJzp3RZFlSvmXeSzjAr92hPqXWQS-3hoC8jwQAvD_BwE&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=CjwKCAiA1-6sBhAoEiwArqlGPoWz7UQl1RrjuP_vsio_OUcpJzp3RZFlSvmXeSzjAr92hPqXWQS-3hoC8jwQAvD_BwE:G:s&s_kwcid=AL!596!3!659805002549!p!!g!!air%2520vistara%2520booking&s_kwcid=AL!596!3!659805002549!p!!g!!air+vistara+booking&gad_source=1");
		Thread.sleep(2000);
		driver.findElement(By.id("cookieModalCloseBtn")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Departure City']")).sendKeys("Pune");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Select Arrival City']")).sendKeys("Jaipur");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='departCalendar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='25']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='30']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@id='book-flight-widget']")).click();
		Thread.sleep(2000);
		driver.quit();
	}

}
