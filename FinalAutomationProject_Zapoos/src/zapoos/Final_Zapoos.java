package zapoos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Final_Zapoos 
{  
	WebDriver driver ;
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
		 
	     //sign
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/div[2]/div/a")).click();		
	     Thread.sleep(2000);     
		 //Clcik
	     driver.findElement(By.xpath("//*[@id=\"zapposSignIn\"]")).click();		
	     Thread.sleep(2000);            
	  	
	     //Email Id
	      driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("bhagyashri12@gmail.com");
	      Thread.sleep(2000);
	    //Password
		  driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("123456");
		  Thread.sleep(2000);
		  //Click Button
		  driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	   
	}
	@Test (priority = 1)
	  public void SmokeTesting() throws InterruptedException
	 {
	  
		//Step 1: Create Object of Action Class
	    Actions a=new Actions(driver);
	    
	    //Step 2: Create Object of List with WebElement
	    List<WebElement> ls=driver.findElements(By.xpath("//*[@id=\"root\"]/div[1]/header/div[4]/div/nav/ul/li"));
	  
	    //Step 3: Store size of list
	    int listSize=ls.size();
	    System.out.println("No.of Modules: "+listSize);
	    
	    //Step 4: For loop
	    for(int i=1; i<=listSize; i++) 
	    {
	    	//Wait
	    	 Thread.sleep(2000);
	    	 
	    	//Display Module Name
	    	 System.out.println(driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[4]/div/nav/ul/li["+i+"]")).getText());
	    	 
	    	//Perform Mouse Hover
	    	 a.moveToElement(driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[4]/div/nav/ul/li["+i+"]"))).click().perform();
	    	 
	    }
	  }
	
  @Test (priority = 2)
  public void module1() throws InterruptedException 
  {   //Brand
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/nav/ul/li[1]/a")).click();
	  Thread.sleep(2000); 
	  //Subbrand
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/nav/ul/li[1]/div/div/section[1]/ul/li[2]")).click();
	  Thread.sleep(2000); 
	//shop the spring
	  driver.findElement(By.xpath("/html/body/div[1]/main/section/div[2]/div/div/div/nav[2]/ul/li[2]/a")).click();
	  Thread.sleep(2000); 
	  //product
	  driver.findElement(By.xpath("/html/body/div[1]/main/section/div[11]/div/div/div/div[1]/div[1]/div/article/a/div[1]/div/span/span/img")).click();
	  Thread.sleep(2000);
//Size
	  driver.findElement(By.xpath("//*[@id=\"size-dropdown\"]")).click();
	  Thread.sleep(2000); 
	//7  
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[2]/div[2]/div[4]/div[1]/div/div/div/div/ul/li[2]/button/div/div/div")).click();
	  Thread.sleep(2000); 
	  //Add cart
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[2]/div[2]/div[6]/div/button")).click();
	  Thread.sleep(2000); 
	  
  }
  @Test (priority = 3)
  public void module2()  throws InterruptedException 
  {
	  
//	//keep shopping
	  driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[3]/div[2]/button")).click();
	  Thread.sleep(2000); 
	  //shopall
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/div[2]/div[2]/ul/li[2]/div/button/span")).click();
	  Thread.sleep(2000); 
	//New arrival
	  driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[1]/div/div/ul/li[1]/a")).click();
	  Thread.sleep(2000); 
	  //gender
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[1]/div[2]/ul/li[1]/div/button")).click();
	  Thread.sleep(2000);
	  //Women
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[1]/div[2]/ul/li[1]/div/div/div/div[2]/ul/li[1]/button/a")).click();
	  Thread.sleep(2000);  
	  //product type
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[1]/div[2]/ul/li[2]/div/button")).click();
	  Thread.sleep(2000);
	  //cloth
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[1]/div[2]/ul/li[2]/div/div/div/div[2]/ul/li[1]/button/a")).click();
	  Thread.sleep(2000); 
	  //clear
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[1]/div[3]/button")).click();
	  Thread.sleep(2000);
	  //product
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[2]/div/div[1]/div[1]/article/a/div/div/span/span/img")).click();
	  Thread.sleep(2000);
	  
      //Size
	  driver.findElement(By.xpath("//*[@id=\"size-dropdown\"]")).click();
	  Thread.sleep(2000); 
	//NO 4 
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[2]/div[2]/div[4]/div/div/div/div/div/ul/li[2]/button/div/div/div")).click();
	  Thread.sleep(2000); 
	  //Add cart
	  driver.findElement(By.xpath("/html/body/div[1]/main/div/div/div/div[2]/div[2]/div[6]/div/button")).click();
	  Thread.sleep(2000); 
  }
  
  @Test (priority = 4)
  public void module3()  throws InterruptedException 
  {
	
	//keep shopping
      driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div[3]/div[2]/button")).click();
      Thread.sleep(2000); 
	 
      //What's new
	  driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/header/div[2]/div[2]/ul/li[1]/div/button/span")).click();
	  Thread.sleep(2000); 
	//Zapoos print all
	  driver.findElement(By.xpath("/html/body/div[1]/main/div[2]/div/div/div[2]/ul/li[1]/a/div[1]/span/span/img")).click();
	  Thread.sleep(2000); 
	  //product 
	  driver.findElement(By.xpath("/html/body/div[1]/main/section/div[6]/div/div/div[2]/div/div/div[1]/div/a/div/p/span[2]")).click();
	  Thread.sleep(2000);
	  //Images
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[2]/div[1]/div/div[1]/div[1]/section/div[2]/div/ul/li[2]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[2]/div[1]/div/div[1]/div[1]/section/div[2]/div/ul/li[3]/button")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[2]/div[1]/div/div[1]/div[1]/section/div[2]/div/ul/li[5]/button")).click();
	  Thread.sleep(2000);
	 //size Some time this x path is working some time its not working 
	  driver.findElement(By.xpath("//*[@id=\"buyBoxForm\"]/div[2]/fieldset/div/div[3]/label")).click();
	  Thread.sleep(2000); 
	 
	//Add cart (Some time this x path is working some time its not working )
	  driver.findElement(By.xpath("//*[@id=\"buyBoxForm\"]/div[4]/div/div/div/button")).click();
	  Thread.sleep(2000); 
	//View cart
	  driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/form/a")).click();
	  Thread.sleep(2000);  
	 
  }
  
  @Test (priority = 5)  // This Is American site thats why some time this module work Properly or some time not 
  public void module4()  throws InterruptedException 
  {
	  
	 //Men
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/nav/ul/li[3]/a")).click();
	  Thread.sleep(2000); 
	  //Boots
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/nav/ul/li[3]/div/div/section[1]/ul/li[3]/a")).click();
	  Thread.sleep(2000); 
	
      //product
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[4]/div/article[1]/a")).click();
	  Thread.sleep(2000); 
	  //clr
//	  driver.findElement(By.xpath("//*[@id=\"buyBoxForm\"]/div[1]/fieldset/div/label[3]")).click();
//	  Thread.sleep(2000);
	  //No 8 
	  driver.findElement(By.xpath("//*[@id=\"buyBoxForm\"]/div[2]/fieldset[1]/div/div[3]/label")).click();
	  Thread.sleep(2000); 
	  //Add cart
	  driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/form/a")).click();
	  Thread.sleep(2000); 
	//View cart
	  driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/form/a")).click();
	  Thread.sleep(2000);  
	 
	 
  }
  
  @Test (priority = 6)
  public void module5()  throws InterruptedException 
  {
	//  Dirpt
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/nav/ul/li[5]/a")).click();
	  Thread.sleep(2000); 
	  //Jewalary
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div[4]/div/nav/ul/li[5]/div/div/section[1]/ul/li[5]/a")).click();
	  Thread.sleep(2000); 
	
      //Watch
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div[2]/div/div/div/article[3]/a")).click();
	  Thread.sleep(2000); 
	  //product Nixcon
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div[4]/div/article[1]/a")).click();
	  Thread.sleep(2000);
	  
	  //Add cart
	  driver.findElement(By.xpath("//*[@id=\"buyBoxForm\"]/div[4]/div/div/div")).click();
	  Thread.sleep(2000); 
	//View cart
	  driver.findElement(By.xpath("/html/body/div[5]/div/div[4]/form/a")).click();
	  Thread.sleep(2000);  
	  //We can not add address details and not applicable to add click button
	  //Checkout
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div[2]/div[2]/div/div/button")).click();
      Thread.sleep(2000);
	  //Name
	  driver.findElement(By.xpath("//*[@id=\"fullName\"]")).sendKeys("Bhagyshree Nandgawali");
      Thread.sleep(2000);
     	//Address Line 1
	  driver.findElement(By.xpath("//*[@id=\"addressLine1\"]")).sendKeys("Nagpur");
	  Thread.sleep(2000);
	  //Address Line 2
	  driver.findElement(By.xpath("//*[@id=\"addressLine2\"]")).sendKeys("Wardha");
	  Thread.sleep(2000);
	  //City
	  driver.findElement(By.xpath("//*[@id=\"city\"]")).sendKeys("Nagpur");
	  Thread.sleep(2000);
	  //State
	  driver.findElement(By.xpath("//*[@id=\"stateOrRegion\"]")).sendKeys("Mahaarashtra");
	  Thread.sleep(2000);
	  //Pin Code
	  driver.findElement(By.xpath("//*[@id=\"postalCode\"]")).sendKeys("423203");
	  Thread.sleep(2000);
	  //Phone No
	  driver.findElement(By.xpath("//*[@id=\"primaryVoiceNumber\"]")).sendKeys("9923917099");
	  Thread.sleep(2000);
	  
	  
	  
	  
  }
  @Test (priority = 7)
  public void ScreenshortandScrollDown ()  throws InterruptedException, IOException 
  {
	  //Url
	  driver.get("https://www.zappos.com/cart#login_modal");
	  //Payment Button
	  driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/main/div/div/div/div/div[1]/ul[1]/li[3]/div/div/form/button")).click();
	  //Scroll  down
	 	 JavascriptExecutor js=(JavascriptExecutor)driver;
	     js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		 Thread.sleep(2000);
		 //About us
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/footer/div[1]/div[3]/ul[1]/li[1]/a")).click();
    	  Thread.sleep(2000);  
	  // Screenshort
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File(".\\Zapoos_FinalProject_Aboutus.png"));
		Thread.sleep(2000);
  }
 

  @AfterClass
  public void afterClass() 
  {
	  driver.close(); 
  }

}
