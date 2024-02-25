package com.AutomationFramework2.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.AutomationFramework2.genericLib.BaseTest;
import com.AutomationFramework2.genericLib.Flib;
import com.AutomationFramework2.genericLib.WorkLib;
import com.AutomationFramework2.pompages.CreateNewProjectPage;
import com.AutomationFramework2.pompages.HomePage;
import com.AutomationFramework2.pompages.LoginPage;
import com.AutomationFramework2.pompages.OpenTasks;
import com.AutomationFramework2.pompages.ProjectAndCustomerPage;

public class CreateCustomer_ProjectTest extends BaseTest {

	@Test()
	public void createCustomerAndProject() throws EncryptedDocumentException, IOException, InterruptedException {

		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage logp = new LoginPage(driver);
		logp.loginIntoActitime(username, password);
	
		HomePage hop = new HomePage(driver);
		hop.clickOnTasksLink();

		
		OpenTasks otask = new OpenTasks(driver);
		otask.clickOnProjectAndCustomer();


		ProjectAndCustomerPage pc = new ProjectAndCustomerPage(driver);
		pc.clickOnCreateNewCustomer();

		Flib lib = new Flib();
		WorkLib wlib = new WorkLib();
		String customerName = lib.getDataFromExcelFile(EXCELPATH, CUSTOMERSHEET, 1, 0) + wlib.randomNo();
		String projectName = lib.getDataFromExcelFile(EXCELPATH, CUSTOMERSHEET, 1, 1) + wlib.randomNo();


		CreateNewProjectPage cpp = new CreateNewProjectPage(driver);
		cpp.createCustomerAndProject(customerName, projectName, driver);
	}
}
