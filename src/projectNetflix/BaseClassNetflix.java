package projectNetflix;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClassNetflix {
	
	
	WebDriver driver; 
	
	public void BrowserInitiation()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/browse");
		driver.manage().timeouts().implicitlyWait(7,TimeUnit.SECONDS);
		NeflixLoginPage LP = new NeflixLoginPage(driver);
		ProfileViewPage PP = new ProfileViewPage(driver);
	}
	
	public void CloseBrowser()
	{
		driver.close();
	}
	
	public static void main(String[] args) {
		
		
	
	}

}
