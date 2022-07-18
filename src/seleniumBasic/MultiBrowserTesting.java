package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

public class MultiBrowserTesting {
	
	@Parameters("browserName")
	@Test
	public void multiBrowser(String browserName)
	{
		
		WebDriver driver = null;
		
		if(browserName.equals("Chrome"))
		{
			
			System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.amazon.com");
					
		}
		
		else if(browserName.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Gecko Driver 64 Bit\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.google.com");
			
		}
		
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		
	}
	
	
	

}
