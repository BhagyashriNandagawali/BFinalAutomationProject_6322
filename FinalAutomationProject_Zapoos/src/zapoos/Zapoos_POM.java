package zapoos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Zapoos_POM 
{
	public void maximizeBrowser(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	public void url(WebDriver driver)
	{
	    driver.get("https://www.zappos.com/?tgt=/zap&lt=true");
	}
	public void webdriver(WebDriver driver)
	{
	    driver.findElement(By.xpath("//*[@id=\"root\"]/div[1]/header/div[4]/div/div[2]/div/a")).click();
	}
	public void login(WebDriver driver)
	{
	    driver.findElement(By.xpath("//*[@id=\"zapposSignIn\"]")).click();
	}
    public void email(WebDriver driver, String email)
	{
	    driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(email);
	}
	public void passWord(WebDriver driver, String pwd)
	{
	    driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys(pwd);
	}
	public void loginButton(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click();
	}
	public void logout(WebDriver driver)
	{
		driver.findElement(By.xpath("//*[@id=\"headerMyAccountDropdownToggle\"]")).click();
	}
	public void logOut(WebDriver driver)
	{
		//driver.findElement(By.xpath("//*[@id=\"customer_logout_link\"]")).click();
	}
	public void closeBrowser(WebDriver driver)
	{
	    driver.close();
	}
}
