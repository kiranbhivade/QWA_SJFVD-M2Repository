package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class InvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException, InterruptedException {
		BaseTest test=new BaseTest();
		test.setup();
		
		Flib f=new Flib();
		
		String username = f.getDataFromProperty(PROPPATH,"Iusername");
		String password = f.getDataFromProperty(PROPPATH,"Ipassword");
		
		//calling non-static variable 
		test.driver.findElement(By.name("username")).sendKeys(username);
		test.driver.findElement(By.name("pwd")).sendKeys(password);
		test.driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		test.tearDown();
		
	}

}
