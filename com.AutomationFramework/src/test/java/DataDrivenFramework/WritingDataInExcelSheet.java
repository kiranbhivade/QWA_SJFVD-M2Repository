package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WritingDataInExcelSheet {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/valid.xlsx");
		
		
	   Workbook book = WorkbookFactory.create(fis);
	   
	   Sheet sheet = book.getSheet("valid");
	   
	   Row row = sheet.getRow(1);
	   
	   Cell cell = row.createCell(2);
	   
	   cell.setCellValue("Pass");
	   
	   FileOutputStream fos=new FileOutputStream("./src/test/resources/valid.xlsx");
	   
	   book.write(fos);
	   
	   System.out.println("Data sent successfully");
	}

}
