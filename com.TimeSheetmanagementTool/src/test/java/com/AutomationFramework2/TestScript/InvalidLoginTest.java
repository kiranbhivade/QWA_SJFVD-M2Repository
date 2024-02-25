package com.AutomationFramework2.TestScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.AutomationFramework2.genericLib.BaseTest;
import com.AutomationFramework2.genericLib.ConstantListener;
import com.AutomationFramework2.genericLib.Flib;
import com.AutomationFramework2.pompages.LoginPage;

@Listeners(ConstantListener.class)
public class InvalidLoginTest extends BaseTest {
	
   @Test(groups = "ST")
	public void invalidLogin() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		int rc = lib.getRowCount(EXCELPATH, INVALIDSHEETNAME);
		for (int i = 1; i <= rc; i++) {
			String username = lib.getDataFromExcelFile(EXCELPATH, INVALIDSHEETNAME, i, 0);
			String password = lib.getDataFromExcelFile(EXCELPATH, INVALIDSHEETNAME, i, 1);
			LoginPage lop = new LoginPage(driver);
			lop.invalidLoginIntoActitime(username, password);

		}
   }
}

