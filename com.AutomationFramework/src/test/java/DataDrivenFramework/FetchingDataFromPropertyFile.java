package DataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FetchingDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/CommonData.properties");
		
		Properties prop=new Properties();
		prop.load(fis);
		
		String browser = prop.getProperty("Browser");
		 
		System.out.println(browser);
		
		
	}

}
