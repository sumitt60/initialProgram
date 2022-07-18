package handleListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ListBox1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		//font[text()='Create a new account']
		
		driver.findElement(By.xpath("//a[text()='Create New Account']")).click();
		Thread.sleep(1000);
		WebElement day, month, year;
		day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
		month =	driver.findElement(By.xpath("//select[@id='month']"));
		//driver.findElement(By.xpath("//select//option[@value='1993']")).click();
		year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
		
		Select s = new Select(month);
		Select s1 = new Select(day);
		Select s2 = new Select(year);
		s.selectByVisibleText("Jun");
		s1.selectByIndex(7);
		s2.selectByValue("1993");
		Thread.sleep(1000);
		
	//	driver.close();
		
				
	}
	
	
}
