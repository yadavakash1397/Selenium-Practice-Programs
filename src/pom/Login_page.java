package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page 
{
	//find Elements-----------------------1------------------------------
	
	//username
	@FindBy(xpath = "//input[@id='userid']")private WebElement username;
	
	//password
	@FindBy(xpath = "//input[@id='password']")private WebElement password;
	
	//login
	@FindBy(xpath = "//button[text()='Login ']")private WebElement login;
	
	//intialize variables -------------------2-------------------------------
	
	public Login_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//create methods
	
	//Enter Username
	public void Enter_username()
	{
		username.sendKeys("DV1510");
	}
	
	//enter password
	public void Enter_password()
	{
		password.sendKeys("Vijay@123");
	}
	
	//click on login
	public void Click_on_Login()
	{
		login.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
