package assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
							"C:\\Users\\91976\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		//1.open google
		driver.get("http:\\www.google.com");
		
		//2.wait for 2 sec and maximize screen
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		//3. change size of browser
		Thread.sleep(500);
		Dimension d=new Dimension(400,500);
		driver.manage().window().setSize(d);
		
		//4. change position of browser
		Thread.sleep(500);
		Point p=new Point(100,200);
		driver.manage().window().setPosition(p);
		
		//5. close the browser
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
