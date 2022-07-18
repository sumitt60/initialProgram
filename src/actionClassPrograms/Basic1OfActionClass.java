package actionClassPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Basic1OfActionClass {
	
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//http://demo.automationtesting.in/Frames.html
		
		driver.get("http://demo.automationtesting.in/Frames.html");

		//a[text()='SwitchTo']
		
		WebElement dropdown;
		
		dropdown = driver.findElement(By.xpath("//a[text()='SwitchTo']"));
		
		Thread.sleep(1000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(dropdown).perform();
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src, dest;
		src = ts.getScreenshotAs(OutputType.FILE);
		dest = new File("C:\\Users\\SUMIT\\Pictures\\Saved Pictures\\DropDown.png");
		FileHandler.copy(src, dest);

		
		Thread.sleep(1000);
		
		//a[text()='Windows']
		
		WebElement windows;
		
		windows = driver.findElement(By.xpath("//a[text()='Windows']"));
		
		act.click(windows).perform();
		
		src = ts.getScreenshotAs(OutputType.FILE);
		dest = new File("C:\\Users\\SUMIT\\Pictures\\Saved Pictures\\Windows.png");
		FileHandler.copy(src, dest);
		
		Thread.sleep(1000);

		driver.close();
		
		
		
	}

}
