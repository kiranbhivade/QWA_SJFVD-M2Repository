package learningTestNG;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import DataDrivenFramework.Flib;

public class InvalidLoginOfActitime extends BaseTest {
	
	@Test
   public void invalidLogin() throws EncryptedDocumentException, IOException {
	   
   
	Flib lib = new Flib();
	int row_count = lib.getRowCount(EXCELPATH, ISHEETNAME);
	System.out.println(row_count);
	for (int i = 1; i <= row_count; i++) 
	   {
		String username = lib.getDataFromExcelSheet(EXCELPATH, ISHEETNAME, i, 0);
		String password = lib.getDataFromExcelSheet(EXCELPATH, ISHEETNAME, i, 1);
		WebElement username1 = driver.findElement(By.name("username"));
		username1.sendKeys(username);
		WebElement password1 = driver.findElement(By.name("pwd"));
		password1.sendKeys(password);
		username1.clear();
		password1.clear();
	}

}
}