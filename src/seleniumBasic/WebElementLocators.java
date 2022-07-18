package seleniumBasic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementLocators {
	
public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//id("twotabsearchtextbox")
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Dell");
		
		//(//input[@class="nav-input nav-progressive-attribute"])[2]	
		
		driver.findElement(By.xpath("(//input[@class=\"nav-input nav-progressive-attribute\"])[2]")).click();
		
		//span[contains(text(),"Hello, Sign")]
		//span[contains(@id,"nav-link-acc")]
		
			
	
}
}
