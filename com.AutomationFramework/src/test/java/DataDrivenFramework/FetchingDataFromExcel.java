package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class FetchingDataFromExcel {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData.xlsx");
		Workbook book=WorkbookFactory.create(fis);
		
	 	Sheet sheet = book.getSheet("valid");
	 	
	  	Row row = sheet.getRow(1);
	  	
	  	Cell cell = row.getCell(0);
	  	
	  	String username = cell.getStringCellValue();
	  	System.out.println(username);
	 	
	}

}
