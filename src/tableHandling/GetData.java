package tableHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetData 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\91976\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("C:\\Users\\91976\\Desktop\\html\\table_handling.html");
		
//		List<WebElement> headers = driver.findElements(By.xpath("//table[@border='5']//tr/th"));
//		for(int i=0;i<=headers.size()-1;i++)
//		{
//			System.out.print(headers.get(i).getText()+"   ");
//		}
//		System.out.println();
		
		int rowsize = driver.findElements(By.xpath("//table[@border='5']//tr")).size();
		
		for(int i=1;i<=rowsize;i++)
		{
			if(i==1)
			{
				int columnsize = driver.findElements(By.xpath("//table[@border='5']//tr["+i+"]/th")).size();
				for(int j=1;j<=columnsize;j++)
				{
					String data = driver.findElement(By.xpath("//table[@border='5']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(data+"  ");
				}
				System.out.println();
			}
			else
			{
				int columnsize = driver.findElements(By.xpath("//table[@border='5']//tr["+i+"]/td")).size();
				for(int j=1;j<=columnsize;j++)
				{
					 String data = driver.findElement(By.xpath("//table[@border='5']//tr["+i+"]/td["+j+"]")).getText();
					 System.out.print(data+"   ");
				}
				System.out.println();
				
			}
			
			
			
		}
		
		
		
		
		
		
		
		

	}

}
