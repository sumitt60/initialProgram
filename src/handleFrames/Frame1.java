package handleFrames;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	
	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get
		("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.manage().window().maximize();
		
		List<WebElement> frames = driver.findElements(By.tagName("iframe"));
		
		for(WebElement el:frames)
		{
			System.out.println(el.getText());
		}
		
		driver.switchTo().frame("iframeResult");
		driver.findElement(By.xpath("/html/body/button")).click();

		Thread.sleep(1000);
		
		
		
	}
	
}
