package WebDriverMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		String url=driver.getCurrentUrl();
		//System.out.println(url);
		
		if(url.equals("https://www.amazon.in/"))
		{
			System.out.println("Test case pass");
		}
		else
		{
			System.out.println("test case fail");
		}
	}

}
