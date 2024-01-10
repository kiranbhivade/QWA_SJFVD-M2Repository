package Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ActitimeCreateUser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://laptop-kiran2/login.do");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
        driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        driver.findElement(By.xpath("//a[@id='loginButton']")).click();
        driver.findElement(By.xpath("//a[@class='content users']")).click();
        driver.findElement(By.xpath("//input[@value='Create New User']")).click();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("BhivadeKiran");
        driver.findElement(By.xpath("//input[@name='passwordText']")).sendKeys("kiran1234");
        driver.findElement(By.xpath("//input[@name='passwordTextRetype']")).sendKeys("kiran1234");
       
        WebElement w=driver.findElement(By.xpath("//select[@name='active']"));
        Select s=new Select(w);
        s.selectByVisibleText("disabled");
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Kirann");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Bhivade");
        
        driver.findElement(By.xpath("//label[@id='notSelectableLabel']")).click();
        driver.findElement(By.xpath("//input[@value='   Create User   ']")).click();
       
        WebElement ele=driver.findElement(By.xpath("//a[@href='/administration/useredit.do?noReload=false&userId=12']"));
        String str=ele.getText();
        System.out.println(str);
        
        System.out.println();
        Thread.sleep(2000);
        driver.quit();
	}

}
