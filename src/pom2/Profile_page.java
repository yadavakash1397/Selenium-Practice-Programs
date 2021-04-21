package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Profile_page
{
	//1
	@FindBy(xpath = "//h4[@class='username']")private WebElement acc_name;
	
	@FindBy(xpath = "//a[text()=' Logout']") private WebElement logout;
	
	//2
	public Profile_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void clickProfile_pagelogout()
	{
		logout.click();
	}
	
	void verifyProfile_pageacc_name()
	{
		String expected="Kulkarni Vijay Bharat";
		if(expected.equals(acc_name.getText()))
		{
			System.out.println("accout name verified");
		}
		else
		{
			System.out.println("accout name not matched");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
