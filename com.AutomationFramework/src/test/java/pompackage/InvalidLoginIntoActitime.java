package pompackage;

import java.io.IOException;

public class InvalidLoginIntoActitime extends BaseTest{
	public static void main(String[] args) throws IOException {
	
		BaseTest test=new BaseTest();
		test.setup();
		
		LoginPage lp=new LoginPage(driver);
		
		Flib lib=new Flib();
		
		int rowcount=lib.getRowCount(EXCELPATH,ISHEETNAME);
		
		for(int i=1;i<=rowcount;i++) {
			lp.invalidLoginIntoActitime(lib.getDataFromExcelSheet(EXCELPATH, ISHEETNAME,i,0),
					lib.getDataFromExcelSheet(EXCELPATH, ISHEETNAME, i, 1));
			
		}
		
		
		
	}

}
