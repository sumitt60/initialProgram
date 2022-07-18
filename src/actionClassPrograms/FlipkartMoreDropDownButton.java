package actionClassPrograms;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class FlipkartMoreDropDownButton {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(1000);
		//button[@class='_2KpZ6l _2doB4z']
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(3000);
		
		WebElement login;
		
		login = driver.findElement(By.xpath("//a[text()='Login']"));
		
				
		Actions act = new Actions(driver);
		act.moveToElement(login).perform();
		Thread.sleep(1000);
			
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src, dest;
		src = ts.getScreenshotAs(OutputType.FILE);
		dest = new File("C:\\Users\\SUMIT\\Pictures\\Saved Pictures\\LoginFlipkart.png");
		FileHandler.copy(src, dest);
		
		
		//div[text()='My Profile']
		
		WebElement MyProfile;
		MyProfile = driver.findElement(By.xpath("//div[text()='My Profile']"));
		
		act.click(MyProfile).perform();
		Thread.sleep(1000);

		src = ts.getScreenshotAs(OutputType.FILE);
		dest = new File("C:\\Users\\SUMIT\\Pictures\\Saved Pictures\\MyProfile.png");
		FileHandler.copy(src, dest);
		
		
		
		Thread.sleep(1000);
		driver.close();
		
		
	
	
	}
	
	
}
