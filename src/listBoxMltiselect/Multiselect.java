package listBoxMltiselect;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multiselect 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\91976\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("C:\\Users\\91976\\Desktop\\html\\multiselect list.html");	
		Thread.sleep(4000);

		WebElement listbox = driver.findElement(By.xpath("//select[@name='cars']"));		
		listbox.click();
		Thread.sleep(1000);
		
		Select slist=new Select(listbox);
//		System.out.println(slist.isMultiple());   //1 listbox is multiple or not
//		Thread.sleep(5000);
//		
//		System.out.println(slist.getFirstSelectedOption().getText());   //2 print first selected option
//		
//		List<WebElement> alloptions = slist.getAllSelectedOptions();	//3 print all selected options
//		
//		for(WebElement oneoption:alloptions)
//		{
//			System.out.println(oneoption.getText());
//		}
		
		Thread.sleep(5000);
//		slist.deselectAll();
		
		slist.deselectByIndex(3);
		Thread.sleep(5000);
		
		slist.deselectByValue("volvo");
		Thread.sleep(5000);
		
		slist.deselectByVisibleText("Opel");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
