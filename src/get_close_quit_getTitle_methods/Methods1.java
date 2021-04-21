package get_close_quit_getTitle_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Methods1
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", 
							"C:\\Users\\91976\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.flipkart.com");
		
		Thread.sleep(2000);
		//driver.close();
		//driver.quit();
		System.out.println("title is: "+driver.getTitle());
		
		
	}

}
