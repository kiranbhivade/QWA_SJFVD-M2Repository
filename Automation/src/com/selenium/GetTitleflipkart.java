package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleflipkart {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		String actualtitle=driver.getTitle();
		if(actualtitle.equals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. "))
		{
		System.out.println("Test Case is pass");
		}
		else
		{
		System.out.println("Test Case is Fail");
		}
	
	}

}
