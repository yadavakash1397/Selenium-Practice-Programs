package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_1_page 
{
	//1
	@FindBy(xpath = "//input[@id='userid']") private WebElement username;
	
	@FindBy(xpath = "//input[@id='password']") private WebElement password;
	
	@FindBy(xpath = "//button[text()='Login ']") private WebElement login_button;
	
	@FindBy(xpath = "//a[text()='Forgot password?']") private WebElement forgot_password;
	
	//2
	public Login_1_page(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//3
	void setLogin_1_pageusername()
	{
		username.sendKeys("DV1510");
	}
	
	void setLogin_1_pagepassword()
	{
		password.sendKeys("Vijay@123");
	}
	
	void clickLogin_1_pagelogin()
	{
		login_button.click();
	}
	
	void clickLogin_1_pageforgtpwd()
	{
		forgot_password.click();
	}
	
	
	
	
	
	
	
}
