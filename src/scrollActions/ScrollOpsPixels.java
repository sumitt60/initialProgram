package scrollActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ScrollOpsPixels {

	@Test
	public void ScrollOps() throws InterruptedException 
	{
		
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
		Thread.sleep(1000);
		Reporter.log("Thread.Sleep(1000) Executed");
		driver.close();
		Reporter.log("Driver Closed. Test Complete!");
		
	}
	
}
