package mozillaFirefox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MFo2 {
	
	
	@Test
	public void OpenFire()
	{
		
		System.setProperty("webdriver.gecko.driver", "C:\\Gecko Driver 64 Bit\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com");
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		

		
		
	}

}
