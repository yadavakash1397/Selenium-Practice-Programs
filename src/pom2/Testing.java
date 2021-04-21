package pom2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Testing 
{
	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver", 
				"D:\\All about Software testing\\Software For Testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		//disable notifications
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		
		//page1
		Login_1_page lp1=new Login_1_page(driver);
		lp1.setLogin_1_pageusername();
		lp1.setLogin_1_pagepassword();
		lp1.clickLogin_1_pagelogin();
		
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		
		//page2
		Pin_page pp=new Pin_page(driver);
		pp.setPin_pagepin();
		pp.clickPin_pagecont();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//page3
		Dashboard_page dp=new Dashboard_page(driver);
		dp.verifyDashboard_pageid();		
		dp.clickDashboard_pageid();
		
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//page4
		Profile_page prp=new Profile_page(driver);
		
		prp.verifyProfile_pageacc_name();
		prp.clickProfile_pagelogout();
		
		
		
		
	}

}
