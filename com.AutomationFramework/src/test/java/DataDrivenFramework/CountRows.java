package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CountRows {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/valid.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		
		Sheet sheet = book.getSheet("valid");
		int count=sheet.getLastRowNum();
		
		System.out.println(count);
		
	}

}
