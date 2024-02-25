package com.AutomationFramework2.genericLib;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseTest implements IAutoConstant {

	public static WebDriver driver;
	 public static WebDriver sdriver;
	public Flib lib;

	@Parameters("browser")
	@BeforeClass(alwaysRun = true)
	public void launchBrowser(@Optional("chrome")String browser) throws IOException {
		lib = new Flib();

		//String browser = lib.getDataFromPropertyFile(PROPPATH,"Browser");
		String url = lib.getDataFromPropertyFile(PROPPATH, "Url");
		Reporter.log("Launching" + browser + "Browser", true);
		if (browser.equals("chrome")) {
			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.equals("edge")) {
			driver = new EdgeDriver();

		} else {
			Reporter.log("No  browser Found", true);
		}
		driver.manage().window().maximize();
		sdriver=driver;

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECONDS));
		driver.get(url);

	}

	@AfterClass(alwaysRun = true)
	public void closeBrowser() {
		driver.quit();
	}
}
