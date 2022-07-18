package screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class Screenshot1 {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {

		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
				
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com");
		Thread.sleep(1000);
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src, dest;
		
		src  = ts.getScreenshotAs(OutputType.FILE);
		
		dest = new File("C:\\Users\\SUMIT\\Pictures\\Saved Pictures\\Output.png");
 
		FileHandler.copy(src, dest);
		
		TakesScreenshot t1;
	
		
		
		Thread.sleep(1000);

		driver.close();
				
				
	
	}
}
