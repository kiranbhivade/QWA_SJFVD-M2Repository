package KeywordDrivenFramework;

import java.io.IOException;

import org.openqa.selenium.By;

public class ValidLogin extends BaseTest{
	public static void main(String[] args) throws IOException {
		
		BaseTest test=new BaseTest();
		test.setup();
		
		Flib f=new Flib();
		
		String username = f.getDataFromProperty(PROPPATH,"Username");
		String password = f.getDataFromProperty(PROPPATH,"Password");
		
		//calling non-static variable 
		test.driver.findElement(By.name("username")).sendKeys(username);
		test.driver.findElement(By.name("pwd")).sendKeys(password);
		test.driver.findElement(By.id("loginButton")).click();
		
		test.tearDown();
		
	}

}
