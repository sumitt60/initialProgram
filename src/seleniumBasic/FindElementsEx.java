package seleniumBasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementsEx {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		List<WebElement> element = 	driver.findElements(By.tagName("a"));
		int size = element.size();
		System.out.println(size);
		for(WebElement e:element)
		{
			System.out.println(e.getText());
		}
		
	}

}
