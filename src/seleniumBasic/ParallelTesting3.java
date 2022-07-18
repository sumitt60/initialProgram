package seleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelTesting3 {
	
	
	@Test
	public void OpenFlipkart()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com");
		//System.out.println(driver.getCurrentUrl());
		//Reporter.log(driver.getCurrentUrl());
	}

}
