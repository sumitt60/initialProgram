package actionClassPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NaukriAction {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Gecko Driver 64 Bit\\geckodriver-v0.31.0-win64\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.naukri.com/");
		
		
		
		WebElement jobs = driver.findElement(By.xpath("//li[@class='mActive Jobs']"));
				//li[@class='mActive Jobs']
				
		Actions a = new Actions(driver);
		
		a.moveToElement(jobs).perform();
		
		
	
	
	}

}
