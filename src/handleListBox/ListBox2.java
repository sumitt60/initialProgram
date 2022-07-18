package handleListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class ListBox2 {

		public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);
		WebElement day, month, year;
		day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		month =	driver.findElement(By.xpath("//select[@id='month']"));
		
			
		Select s = new Select(month);
		
		List <WebElement> MonthCount = s.getOptions();
		
		for(WebElement we : MonthCount)
		{
			
			System.out.println(we.getText());
			
		}
				
		
	
}
}