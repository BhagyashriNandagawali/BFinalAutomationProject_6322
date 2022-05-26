package zapoos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class Reg_Zapoos 
{   WebDriver driver ;
	@BeforeClass
	public void beforeClass() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "D:\\Users\\Admin\\Documents\\Automation Testing\\Browser Extension\\chromedriver.exe");
        driver= new ChromeDriver();
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	   
	    //URL
		  driver.get("https://www.zappos.com/?tgt=/zap&lt=true");
		 Thread.sleep(2000);
	}
	 @Test
	  public void Registration() throws Exception
	  {
		  //URL
		  driver.get("https://www.zappos.com/?tgt=/zap&lt=true");
		  
		  //Registration
		  driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[4]/div/div[2]/div/a")).click();
		  Thread.sleep(2000);
		  driver.findElement(By.xpath("//*[@id=\"zapposSignIn\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"createAccountSubmit\"]")).click();
		  driver.findElement(By.xpath("//*[@id=\"ap_customer_name\"]")).sendKeys(" Bhagyashri Nandagawali");
		  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("bhagyashri12@gmail.com");
		  driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Bhagyashri@1");
		  driver.findElement(By.xpath("//*[@id=\"ap_password_check\"]")).sendKeys("Bhagyashri@1");
		  driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
		 
	  }

  @AfterClass
  public void afterClass() 
  {
	  driver.close();
  }

}
