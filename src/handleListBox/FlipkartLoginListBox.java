package handleListBox;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class FlipkartLoginListBox {

	public static void main(String[] args) throws InterruptedException {
		
		
System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(1000);

		//close button
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//a[text()='Login']
		Thread.sleep(1000);
		WebElement MoreButton;
		MoreButton = driver.findElement(By.xpath("//div[text()='More']"));
		MoreButton.click();
		
		Select ListMore = new Select(MoreButton);

//		List.selectByVisibleText("My Profile");
		
		List <WebElement> ListMoreOptions = ListMore.getOptions();
		
		for(WebElement we: ListMoreOptions)
		{
		
			System.out.println(we.getText());
			
		}
			
		
		
		Thread.sleep(2000);
		driver.close();

	}

}
