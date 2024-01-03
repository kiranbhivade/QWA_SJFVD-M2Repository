package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;


public class RTE {
	static WebDriver Driver;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser name");
		String browser=sc.next();
		
		if(browser.equals("chrome"))
		{
		    Driver =new ChromeDriver();
		}
		
		else if(browser.equals("edge"))
		{
			Driver =new EdgeDriver();
		}
		else
		{
		    System.out.println("invalid browser");
		}
		
	}

}
