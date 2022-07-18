package scrollActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestClass {
	
	
	@Test
	public void TestClassM() throws InterruptedException
	{
		Reporter.log("Test Class Executed");
		System.setProperty("webdriver.chrome.driver","C:\\\\ChromeDriver exe file\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		//((JavascriptExecutor)driver).executeScript("window.scrollBy(0,1000)");	
		
		JavascriptExecutor object = (JavascriptExecutor)driver;
		object.executeScript("window.scrollBy(0,1000)");
		Reporter.log("Scroll Down 1000 Pixels");
		object.executeScript("window.scrollBy(0,1000)");
		Reporter.log("Scroll Down 1000 Pixels");
		Thread.sleep(1000);
		Reporter.log("Thread.Sleep(1000) Executed");
		System.out.println("Perform Scroll Up");
		object.executeScript("window.scrollBy(0,-1000)");
		Reporter.log("Scroll Up 1000 Pixels");
				
		WebElement BackToTop = driver.findElement(By.xpath("//span[@class=\"navFooterBackToTopText\"]"));
		object.executeScript("arguments[0].scrollIntoView();", BackToTop);
		
		//Reporter.log("Clicking BackToTop Button");
		//BackToTop.click();
		//Reporter.log("Clicked BackToTop Button");
		
		Thread.sleep(1000);
		Reporter.log("Thread.Sleep(1000) Executed");
	//	driver.close();
		Reporter.log("Driver Closed. Test Complete!");

	}

}
