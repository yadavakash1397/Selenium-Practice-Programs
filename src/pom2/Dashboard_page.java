package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboard_page 
{
	//1
	@FindBy(xpath = "//span[@class='user-id']") private WebElement id;
	
	//2
	public Dashboard_page(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void verifyDashboard_pageid()
	{
		String expected="DV1510";
		if(expected.equals(id.getText()))
		{
			System.out.println("id verified");
		}
		else
		{
			System.out.println("id not matched");
		}
	}
	
	void clickDashboard_pageid()
	{
		id.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
