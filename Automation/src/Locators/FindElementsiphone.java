package Locators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsiphone {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.findElement((By.xpath("//input[contains(@class,'Pke_EE')]"))).sendKeys("iphone",Keys.ENTER);
       List<WebElement> productname=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
      List<WebElement> productprice=driver.findElements(By.xpath("//div[@class='_4rR01T']/ancestor::div[@class='_3pLy-c row']/descendant::div[@class='_30jeq3 _1_WHN1']"));
       for(int i=0;i<productname.size();i++)
       {
    	   String name=productname.get(i).getText();
    	   for(int j=i;j<=i;j++)
    	   {
    	     String price=productprice.get(j).getText();
    	     System.out.println(name + ";" +price);
    	   }
       }
       
	}

}

