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
public class ValidLoginTest extends BaseTest{
	
	@Test(groups = "ST")

	public void login() throws EncryptedDocumentException, IOException {
		Flib lib = new Flib();
		String username = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 0);
		String password = lib.getDataFromExcelFile(EXCELPATH, SHEETNAME, 1, 1);
		LoginPage lop = new LoginPage(driver);
		lop.loginIntoActitime(username, password);
	}

}
