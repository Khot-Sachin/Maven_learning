package Module_1_test;

import java.io.IOException;
 

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Module_1.Guru99_insurance_homepage_pom2;
import Module_1.Guru99_insurance_login_pom1;
import library_file.Base_class;
import library_file.Utility_class;

public class testNG_testclass  extends Base_class
{    
	   //in testNG class class take all annotation 
	
	   Guru99_insurance_login_pom1 login;
	   Guru99_insurance_homepage_pom2 home;
	   
	 @BeforeClass
	public void openbrowser()
	{
		initialise_browser();
		
 
		// create object of pom o
		  login=new Guru99_insurance_login_pom1(driver);		
		
        // create object of pom2
		  home=new Guru99_insurance_homepage_pom2(driver);
		
	}
	
	@BeforeMethod
	public void login() throws IOException, InterruptedException
	{
		// in the beforeclass we write the login related code
		
		login.interemail(Utility_class.getdeta("EM"));
		Thread.sleep(2000);
		login.enterpass(Utility_class.getdeta("PSW"));
		Thread.sleep(2000);
		login.loginbtn();
		Thread.sleep(2000);
	}

	@Test
	public void verifyemail_guru99() throws EncryptedDocumentException, IOException
	{
		 String actual_emailid=home.getEmail();     // we have actual amail
		
		 
		 // to get expected email
	  String expected_email= Utility_class.getemail(0, 0);
	  
		   Assert.assertEquals(actual_emailid, expected_email);
		   
		 
	}
	
	@AfterMethod
	public void logout()
	{
		
		
		home.logout();
		
	}
	
	@AfterClass
	public void closebrowser()
	{
		
		
		driver.close();
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
