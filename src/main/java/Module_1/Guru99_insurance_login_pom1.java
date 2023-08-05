package Module_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Guru99_insurance_login_pom1 {
	
	
      // step --1   	// data members/ global variables should be declared globally with access level private by using find by annotation
	
	 // declare variables same as no of webelements
	
	     @FindBy(xpath="//input[@name='email']") private WebElement email;
	     
	     @FindBy(xpath="//input[@id='password']")private WebElement password;
 
	     @FindBy(xpath="//input[@type='submit']") private WebElement loginbtn;
	     
	   // step - 2 //    initialize within a constructor with access level public  using pagefactory
	     
	     
	     
	    public   Guru99_insurance_login_pom1(WebDriver driver)
	    { 
	    	PageFactory.initElements(driver,this); 
		  
	     }
	    
	    // step 3-- // utilize within a method with access level public
	   
	     public void interemail(String Email)
	     {
	    	 email.sendKeys(Email);
	     }
	     
	     
	     public void enterpass(String Passw)
	     {  
	    	 password.sendKeys(Passw);
          }
	     
	     
	     public void loginbtn()
	     {  loginbtn.click();
	    	 }
	     
	     
}
