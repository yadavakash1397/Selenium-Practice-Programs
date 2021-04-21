package pom2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pin_page 
{

	//1
	@FindBy(xpath = "//input[@id='pin']")private WebElement pin;
	
	@FindBy(xpath = "//button[text()='Continue ']") private WebElement cont;
	
	//2
	public Pin_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3
	void setPin_pagepin()
	{
		pin.sendKeys("959594");
	}
	
	void clickPin_pagecont()
	{
		cont.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
