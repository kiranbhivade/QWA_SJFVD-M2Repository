package com.selenium;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleAmazon {

	        public static void main(String[] args) {
			
	        WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			String actualtitle=driver.getTitle();	
			System.out.println(actualtitle);
		

	}


}
