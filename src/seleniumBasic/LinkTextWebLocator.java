package seleniumBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextWebLocator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.com");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//linkText('Click here to go to amazon.in')
		
		driver.findElement(By.partialLinkText("go to amazon.in")).click();
		
//		driver.navigate().back();
	
		Set<String> windowID = driver.getWindowHandles();
		
		ArrayList<String> windowIDList = new ArrayList<String>(windowID);
		
		driver.switchTo().window(windowIDList.get(1));
		
		System.out.println(driver.getTitle());
		
	}

}
