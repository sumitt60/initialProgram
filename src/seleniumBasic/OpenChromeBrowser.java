package seleniumBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenChromeBrowser {
	
	public WebDriver driver;
	
	public void BrowserOpen(String s) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(s);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		
	}
	
	public void BrowserClose()
	{
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		
			
		OpenChromeBrowser browser = new OpenChromeBrowser();
		browser.BrowserOpen("https://www.91mobiles.com/");
		//Thread.sleep(1000);
		browser.BrowserClose();

		
				
	}

}
