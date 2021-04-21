package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_page 
{
	//find elements and make variables----------------1-----------------
	
	//id
	@FindBy(xpath = "//span[@class='user-id']")private WebElement id;
	
	
	//initialize variables-------------------------------2-----------------------
	public Dashboard_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//create methods for acions
	
	//verify name
	public void Verify_Name()
	{
		String Expected = "DV1510";
		if(id.getText().equals(Expected))
		{
			System.out.println("result varified ok");
		}
		else
		{
			System.out.println("result not matching");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
}
