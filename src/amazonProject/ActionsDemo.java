package amazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		
	
	System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.manage().window().maximize();
	
	WebElement Accounts = driver.findElement(By.xpath("//span[text()='Account & Lists']"));
	
	Actions a = new Actions(driver);
	a.moveToElement(Accounts).perform();
	
	
	}
}
