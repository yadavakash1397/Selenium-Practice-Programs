package pom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actual_Testing 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver",
				"D:\\All about Software testing\\Software For Testing\\selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//login page actions
		Login_page login=new Login_page(driver);
		login.Enter_username();
		login.Enter_password();
		login.Click_on_Login();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//pin page actions
		Pin_page pin2=new Pin_page(driver);
		pin2.Enter_pin();
		pin2.Click_on_continue();
		
		//dashboard page actions
		Dashboard_page dp=new Dashboard_page(driver);
		dp.Verify_Name();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
