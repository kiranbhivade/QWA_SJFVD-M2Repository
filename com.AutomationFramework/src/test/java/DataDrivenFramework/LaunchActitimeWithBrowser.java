package DataDrivenFramework;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;


 public class LaunchActitimeWithBrowser extends LaunchBrowser {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {


		LaunchBrowser browser = new LaunchBrowser();
		browser.setup();

		Flib m = new Flib();
		String username = m.getDataFromExcelSheet("./src/test/resources/TestData.xlsx", "Valid", 1, 0);
		System.out.println(username);

		String password = m.getDataFromExcelSheet("./src/test/resources/TestData.xlsx", "Valid", 1, 1);
		System.out.println(password);

		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();

		browser.closeBrowser();

	}

}
