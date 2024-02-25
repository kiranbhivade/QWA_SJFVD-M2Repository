package learningTestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsOfTestNG {
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("close the connection",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("Connecting to database",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("Launch browser",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("login into application",true);
		
	}
	
	@Test
	public void testscript() {
		Reporter.log("testscript1",true);
	}
	
	@Test
	public void testscript1()
	{
		Reporter.log("testscript2",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("logout of the application",true);
	}
	@AfterClass
	public void afterClass()
	{
		Reporter.log("close the browser",true);
	}

	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("Connecting to the server",true);
	}
	
	@AfterTest
	public void aftertest()
	{
		Reporter.log("close the db connection",true);
	}
}
