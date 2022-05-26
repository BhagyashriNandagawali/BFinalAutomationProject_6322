package zapoos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDT 
{
	
	WebDriver driver;
	@BeforeTest
	public void beforeTest() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Documents\\Automation Testing\\Browser Extension\\geckodriver.exe");
		driver=new FirefoxDriver();
		Thread.sleep(2000);
	   driver.manage().window().maximize();
	}
 
			@Test(dataProvider = "dp1")
		  public void DDT (String  username, String password) throws Exception
			{ 
				Zapoos_POM  w1= new Zapoos_POM ();
			
				w1.maximizeBrowser(driver);
				w1.url(driver);
				w1.webdriver(driver);
				Thread.sleep(2000);
				w1.login(driver);
				Thread.sleep(2000);
				w1.email(driver, username);
				w1.passWord(driver, password);
			
				Thread.sleep(2000);
				w1.loginButton(driver);
				
				w1.logout(driver);
		        w1.closeBrowser(driver);
			}
			

		  @DataProvider
		  public Object[][] dp1()
		  {
		      return new Object[][] 
		  		{
		     
		      new Object[] { "Demo", "Demo1" },
		      new Object[] { "bhagyashri12@gmail.com", "123456" },
		    //  new Object[] { "Demo@gmail.com", "Demo@12" },
		      
		    };
		    
		  }
		  
		  @AfterTest
		  public void afterTest()
		 {
		 	driver.close();
		 }

	}


