package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;


public class RTP{
	static WebDriver Driver;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Browser name");
		Integer browser=sc.nextInt();
		
		if(browser.equals(1))
		{
		    Driver =new ChromeDriver();
		}
		
		else if(browser.equals(2))
		{
			Driver =new EdgeDriver();
		}
		else
		{
		    System.out.println("invalid browser");
		}
		
	}

}
