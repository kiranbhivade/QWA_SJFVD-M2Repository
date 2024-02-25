package com.AutomationFramework2.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.AutomationFramework2.genericLib.BaseTest;
import com.AutomationFramework2.pompages.HomePage;
import com.AutomationFramework2.pompages.LoginPage;
import com.AutomationFramework2.pompages.OpenTasks;
import com.AutomationFramework2.pompages.ProjectAndCustomerPage;

public class DeleteAllProjectandCustomerTest extends BaseTest {
	@Test()
	public void deleteAllProjectAndCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lop = new LoginPage(driver);
		lop.loginIntoActitime(username, password);

	
		HomePage hop = new HomePage(driver);
		hop.clickOnTasksLink();

		
		OpenTasks otask = new OpenTasks(driver);
		otask.clickOnProjectAndCustomer();

	
		ProjectAndCustomerPage pcp = new ProjectAndCustomerPage(driver);
		pcp.clickOnAllDelete();

	}

}
