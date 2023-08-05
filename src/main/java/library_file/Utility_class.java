package library_file;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
 
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class Utility_class {
	
	 

	//Automation test engineer: Sachin 
	//Date: 10/6/2023
	//day:saturday
	// Fetch deta from properties file
	 
	
	@Test
	public static String getdeta(String key) throws IOException
	{
		// to fetch deta from the proerties file we need to create object of 
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium\\login_info.properties");
		
		// to open property file
		
		Properties prop=new Properties();
		
		prop.load(file);
		
		// to fetch deta frpm properties file
		
		String value1=prop.getProperty(key);   //em and psw
		
		return value1;
	}
	
	
	@Test
	public static String getemail(int row,int cell) throws EncryptedDocumentException, IOException
	{
		// to fetch deta from the exel sheet
		
		 FileInputStream file=new FileInputStream("C:\\selenium\\Book1.xlsx");
		 // now to open that file and get deta from that file we need to  call getsheet method which is static method of workbookfactory class
		
		String expected_email= WorkbookFactory.create(file).getSheet("Sheet6").getRow(row).getCell(cell).getStringCellValue();
		
	    return expected_email;
		 
	}

}
