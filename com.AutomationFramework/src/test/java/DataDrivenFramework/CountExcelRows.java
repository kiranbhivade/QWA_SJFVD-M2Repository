package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CountExcelRows {
	 public int rowCount(String path, String sheetName) throws EncryptedDocumentException,IOException
	 {
	 FileInputStream fis = new FileInputStream(path);
	 Workbook book = WorkbookFactory.create(fis);
	 Sheet sheet = book.getSheet(sheetName);
	 int count = sheet.getLastRowNum();
	 return count;
	 }
	 

}
