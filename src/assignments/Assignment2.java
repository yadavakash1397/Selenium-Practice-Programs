package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\91976\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1 open google
		driver.get("http://www.google.com");
		
		//2 maximize browser
		driver.manage().window().maximize();
		
		//3 display url and title of webpage
		System.out.println("title of webpage: "+driver.getTitle());
		System.out.println("url: "+driver.getCurrentUrl());
		
		//4 open facebook
		driver.get("http:\\www.facebook.com");
		
		//5 wait for 2 sec and navigate back to google page
		Thread.sleep(2000);
		driver.navigate().back();
		
		//6 verify google page is opened or not
		String exp="google";
		String act=driver.getTitle();
		if(exp.equalsIgnoreCase(act))
		{
			System.out.println("6. verified... google is opened");
		}
		else
		{
			System.out.println("6. error...google is not opened");
		}
		
		//7.wait for 3 sec and change size of browser 200,400
		Thread.sleep(3000);
		Dimension d=new Dimension(200,400);
		driver.manage().window().setSize(d);
		
		//8. wait for 2 sec and change position of browser
		Thread.sleep(2000);
		Point p=new Point(100,500);
		driver.manage().window().setPosition(p);
		
		//9 wait for 2 sec and maximize browser
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//10 wait for 2 sec and navigate to facebook
		Thread.sleep(2000);
		driver.navigate().forward();
		
		//11 verify facebook is opened or not
		String expf="Facebook – log in or sign up";
		String actf=driver.getTitle();
		
		if(expf.equals(actf))
		{
			System.out.println("11. veified.. facebook is opened");
		}
		else
		{
			System.out.println("11. error.. facebook not opened");
		}
		
		//12 refresh current webpage
		driver.navigate().refresh();
		
		//13 wait for 2 sec and close browser
		Thread.sleep(2000);
		driver.close();
		
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
