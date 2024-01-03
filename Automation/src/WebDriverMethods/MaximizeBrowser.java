package WebDriverMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver.Windows;

public class MaximizeBrowser {
	public static void main(String[] args) {
		

	//to launch a browser
	WebDriver driver=new ChromeDriver();
	
	//to maximize the browser	
	Options opt= driver.manage();
	Window win=opt.window();
	win.maximize();
	//driver.manage().window().maximize();
	
	//to open the webapplication
	driver.get("https://www.amazon.in/");

 }
}
