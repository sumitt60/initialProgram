package handleListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class AmazonSearchBoxDropDown {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		
		Thread.sleep(1000);
		//*[@id='nav-main']/div[1]/div/div/div[3]/span[1]/span/input
		driver.findElement(By.xpath("//*[@id='nav-main']/div[1]/div/div/div[3]/span[1]/span/input")).click();
		Thread.sleep(1000);
		
		//select[@id='searchDropdownBox']
		
		WebElement CategoryDropdown;
		CategoryDropdown = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		CategoryDropdown.click();
		
		Select list = new Select(CategoryDropdown);
		System.out.println(list.isMultiple());
		
		Thread.sleep(1000);
		
		//Arts & Crafts
		
		list.selectByVisibleText("Arts & Crafts");
		System.out.println("\nSelected Category:"+list.getFirstSelectedOption().getText());

		List <WebElement> DropDownList = list.getOptions();
		System.out.println("\nNumber of Categories: "+DropDownList.size());
		System.out.println();
		for (WebElement we : DropDownList)
		{
			System.out.println(we.getText());
		}
		
		CategoryDropdown.click();
		Thread.sleep(1000);
		list.selectByIndex(3); //Baby
	
		System.out.println("\nSelected Category: "+list.getFirstSelectedOption().getText());
		
		CategoryDropdown.click();
		Thread.sleep(1000);
		list.selectByValue("search-alias=videogames-intl-ship");
		
		System.out.println("\nSelected Category: "+list.getFirstSelectedOption().getText());
		
		Thread.sleep(1000);
		driver.close();
		
	}

}
