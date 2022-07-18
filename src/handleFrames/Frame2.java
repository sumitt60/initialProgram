package handleFrames;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.get("https://demo.guru99.com/telecom/index.html");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		
		int size = driver.findElements(By.tagName("iframe")).size();
		System.out.println(size);
		
		List<WebElement> frames = driver.findElements(By.tagName("//iframe"));
			
		for(WebElement ele:frames)
		{
			System.out.println(ele.getText());
		}
		
		
		
}
	
	
}
