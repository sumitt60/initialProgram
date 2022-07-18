package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class MultiBrowserTesting1 {
	
	
	WebDriver driver = null;
	
	@Parameters("browser")
	@Test
	public void multiBrowsers(String browser)
	{
		
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("https://www.google.com");
			driver.manage().window().maximize();
			
		}
		else if (browser.equalsIgnoreCase("firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "C:\\Gecko Driver 64 Bit\\geckodriver-v0.31.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("https://www.bing.com");
			driver.manage().window().maximize();
			
		}
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
	}
	
	
	

}
