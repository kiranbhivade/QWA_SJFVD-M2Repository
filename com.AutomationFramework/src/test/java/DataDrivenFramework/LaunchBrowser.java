package DataDrivenFramework;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static WebDriver driver;

	public void setup() throws IOException {
		Flib method = new Flib();
		String browser = method.getDataFromProperty("./src/test/resources/CommonData.properties", "Browser");
		String url = method.getDataFromProperty("./src/test/resources/CommonData.properties", "Url");
		if (browser.equals("Chrome"))
		{
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		} 
		else if (browser.equals("edge"))
		{
		     driver = new EdgeDriver();
		     driver.manage().window().maximize();
		}

		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    driver.get(url);
	}

     public void closeBrowser() 
	{
		driver.quit();
	}
}
