package handleListBox;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonAllButtonListBox {

	public static void main(String[] args) throws InterruptedException {

System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/s?k=Dell&crid=29NMB0S7QTP6&sprefix=d%2Caps%2C357&ref=nb_sb_noss_2");
		
		Thread.sleep(1000);
		
		//span[@class='hm-icon-label']
		
		WebElement SortButton;
		SortButton = driver.findElement(By.xpath("//i[@class='a-icon a-icon-dropdown']"));
		SortButton.click();
		Thread.sleep(1000);

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Select allList = new Select(SortButton);
		
		allList.selectByVisibleText("Newest Arrivals");
		
        

        
		
		
	}

}
