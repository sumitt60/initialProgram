package amazonProject;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	
	WebDriver driver;
	
	public void inBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		LoginPage Login = new LoginPage(driver);	//For the PageFactory.innitElements(driver,this)
		
		
	}
	
	public void outBrowser()
	{
		driver.close();
	}
	
/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
	
		LoginPage Login = new LoginPage(driver);
		Actions obj = new Actions(driver);


	}*/

}
