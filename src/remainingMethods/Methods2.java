package remainingMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods2 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\91976\\\\Downloads\\\\chromedriver_win32 (1)\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http:\\www.google.com");
		
		String url = driver.getCurrentUrl();	//URL is copied into url variable
		System.out.println(url);
		
		driver.manage().window().maximize();	//maximize chrome browser window
		
		driver.navigate().to("http:\\www.flipkart.com");//opening url
		//Thread.sleep(2000);
		
		driver.navigate().back();	//move backward
		//Thread.sleep(1000);
		
		driver.navigate().forward();//move forward
		//Thread.sleep(1000);
		
		driver.navigate().refresh();//refresh page
		
		Dimension dd=new Dimension(516,200);
		driver.manage().window().setSize(dd);  //set size of window
		
		System.out.println(driver.manage().window().getSize());//get window size
		
		Point p=new Point(300,200);
		driver.manage().window().setPosition(p);	//set position of window
		
		System.out.println(driver.manage().window().getPosition());//get window position
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
