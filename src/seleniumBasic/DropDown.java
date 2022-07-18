package seleniumBasic;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.opc.internal.FileHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;
import org.testng.FileAssert;

public class DropDown {
	
	
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\\\ChromeDriver exe file\\\\chromedriver_win32\\\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//select[@class="nav-search-dropdown searchSelect nav-progressive-attrubute nav-progressive-search-dropdown"]
		//select[contains(@class,"nav-search-dropdown")]
		
		WebElement dropdown = driver.findElement(By.xpath("//select[contains(@class,\"nav-search-dropdown\")]"));
		//dropdown.click();
		Select select = new Select(dropdown);
		
		select.selectByVisibleText("Baby");
		List<WebElement> list1 = select.getOptions();

		for(WebElement el:list1)
		{
			System.out.println("Options: "+el.getText()+" "+"Selected: "+el.isSelected()+" "+"Displayed: "+el.isDisplayed());
			
		}
		
		//System.out.println(list1);
		
		WebElement searchBox = driver.findElement(By.xpath("//input[contains(@id,\"textbox\")]"));
		WebElement searchButton = driver.findElement(By.xpath("//input[contains(@id,\"nav-search-submit-button\")]"));
		
		
		Actions a = new Actions(driver);
		a.sendKeys(searchBox, "Baby Clothes").perform();
		a.click(searchButton).perform();
/*		a.dragAndDrop(searchBox, searchButton).perform();
		a.contextClick(searchButton).perform();
		a.doubleClick(searchButton).perform();
		a.sendKeys(Keys.ENTER).perform(); */
		
		TakesScreenshot screenshot =  ((TakesScreenshot)driver);
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\SUMIT\\Dropbox\\PC\\Desktop\\Automation Testing QnA\\BabyCloathesResult.png");
		FileHandler.copy(src, dest);
	
		

	}
}
