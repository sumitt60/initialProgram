package exceptionHandling;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exceptions1 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//input[contains(@name,"NewTab")]
//		WebElement NewTab = driver.findElement(By.xpath("//input[contains(@name,\"NewTab\")]"));
		try
		{
		WebElement NewTab = driver.findElement(By.xpath("//input[contains(@name,\"no\")]"));
		NewTab.click();
		}
		catch(Exception e)
		{
			System.out.println("Element Not Found : Catch Block Executed");
			
		}
		finally
		{
			System.out.println("Close Browser");
			driver.close();
		
		}
		
	}
	
	
	
}
