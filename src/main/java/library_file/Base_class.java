package library_file;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_class {

	
	 
	// IN BASE CLASS WE WRITE THE CODE OF OPEN BROWSER
	
	    public WebDriver  driver;
	 
	public  void initialise_browser()
	{
     System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver_win32\\chromedriver.exe");
		
	    driver=new ChromeDriver();
	 	
	   
		driver.get( "https://demo.guru99.com/insurance/v1/index.php");
		
		 
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
	}
	
}
