package learningTestNG;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest implements IAutoConstant {
	
	static WebDriver driver;

	@BeforeTest
	public void setup() throws IOException
	{
		Flib f=new Flib();
	    String browser = f.getDataFromProperty(PROPPATH, "Browser");
	    String url = f.getDataFromProperty(PROPPATH, "Url");
	    
	    if(browser.equals("Chrome"))
	    {
	    	driver=new ChromeDriver();
	    }
	   
	    else if (browser.equals("firefox"))
	    {
	    	driver=new FirefoxDriver();
	    	
	    }
	   
	    else if(browser.equals("edge"))
	    {
	    	driver=new EdgeDriver();
	    }
	     driver.manage().window().maximize();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TIMESECOND));
	     driver.get(url); 
	}
	
	@BeforeMethod(enabled = false)
	public void login() throws EncryptedDocumentException, IOException
	{
	Flib lib = new Flib();
	String username = lib.getDataFromExcelSheet(EXCELPATH, SHEETNAME, 1, 0);
	System.out.println(username);
	String password = lib.getDataFromExcelSheet(EXCELPATH,SHEETNAME, 1, 1);
	System.out.println(password);
	driver.findElement(By.name("username")).sendKeys(username);
	driver.findElement(By.name("pwd")).sendKeys(password);
	driver.findElement(By.id("loginButton")).click();
	}
	
	@AfterMethod
	public void logout() {
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}

}
