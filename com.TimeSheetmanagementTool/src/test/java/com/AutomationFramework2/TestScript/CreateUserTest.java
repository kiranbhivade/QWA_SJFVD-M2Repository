package com.AutomationFramework2.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.AutomationFramework2.genericLib.BaseTest;
import com.AutomationFramework2.genericLib.WorkLib;
import com.AutomationFramework2.pompages.CreateNewUserPage;
import com.AutomationFramework2.pompages.CreateUserPage;
import com.AutomationFramework2.pompages.HomePage;
import com.AutomationFramework2.pompages.LoginPage;

public class CreateUserTest extends BaseTest{
	@Test()
	public void createUser() throws EncryptedDocumentException, IOException {

		
		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lop = new LoginPage(driver);
		lop.loginIntoActitime(username, password);
		HomePage hop = new HomePage(driver);
		hop.clickOnUserLink();
		CreateUserPage cp = new CreateUserPage(driver);
		cp.clickOnCreateNewUser();
		CreateNewUserPage cnw = new CreateNewUserPage(driver);
		WorkLib wlib = new WorkLib();
		String username1 = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 0);
		String password1 = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 1);
		String fn = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 2);
		String ln = lib.getDataFromExcelFile(EXCELPATH, USERSHEETNAME, 1, 3);
		cnw.createUser(username1 + wlib.randomNo(), password1 + wlib.randomNo(), fn + wlib.randomNo(),
				ln + wlib.randomNo());

	}

}
