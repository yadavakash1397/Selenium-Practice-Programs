package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_page 
{
	//variable making------------------1--------------------
	
	//pin
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	
	//continue
	@FindBy(xpath = "//button[text()='Continue ']")private WebElement cont;
	
	//initialize variable----------------2------------------------
	
	public Pin_page(WebDriver driver) 
	{
		PageFactory.initElements(driver,this);
	}
	
	//method making for actions--------3----------------------
	
	//enter pin
	public void Enter_pin()
	{
		pin.sendKeys("959594");
	}
	
	//enter password
	public void Click_on_continue()
	{
		cont.click();
	}
	
	
	
	
	
	
	
	
}
