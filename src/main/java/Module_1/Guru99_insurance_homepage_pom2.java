package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_insurance_homepage_pom2 {


    // step --1   	// data members/ global variables should be declared globally with access level private by using find by annotation
	
	 // declare variables same as no of webelements
	
	     @FindBy (xpath = "//h4[text()='saradeg41@gmail.com']") private WebElement signedinas;
	     
	     @FindBy(xpath="//input[@type='submit']")  private WebElement logoutbtn;
	     

	     // step - 2 //    initialize within a constructor with access level public  using pagefactory
	     
  
	     public  Guru99_insurance_homepage_pom2(WebDriver driver)
	     {
	    	PageFactory.initElements(driver, this);
	     }
	     
	     
	  // step --3  // utilize within a method with access level public
	     
		    public String getEmail()
		    {
		    	 
		    	String actual_email=signedinas.getText();

		    	return actual_email;
		    	
		    }
		    
		    public void logout()
		    {
		    	logoutbtn.click();	
		    	
		    }
		     
}