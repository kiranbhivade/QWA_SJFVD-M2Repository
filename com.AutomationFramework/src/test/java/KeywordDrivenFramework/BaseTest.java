package KeywordDrivenFramework;

import java.io.IOException;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConstant {
	
	WebDriver driver;

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
	
	public void tearDown()
	{
		driver.quit();
	}

}
