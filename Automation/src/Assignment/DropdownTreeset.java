package Assignment;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownTreeset {
	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("file:///C:/Users/kiran/OneDrive/Desktop/dropdown.html");
	WebElement dropdown=driver.findElement(By.id("Movies"));
	Select s=new Select(dropdown);
	List<WebElement>allduplicate=s.getOptions();
	TreeSet<String> set=new TreeSet<String>();
	for(int i=0;i<allduplicate.size();i++)
	{
		String alloptions=allduplicate.get(i).getText();
		set.add(alloptions);
		
	}
	for(String option:set)
	{
		System.out.println(option);
	}
	
	
	}

}
