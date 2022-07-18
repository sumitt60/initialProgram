package handleListBox;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import seleniumBasic.OpenChromeBrowser;

public class ListBox3 extends OpenChromeBrowser {
	
	
	//WebDriver driver;
	
	
	
	public void LB() throws InterruptedException
	{
		//select[@id='auto_suggest_category']
	
		WebElement AllButton;
		AllButton = driver.findElement(By.xpath("//select[@id='auto_suggest_category']"));
		AllButton.click();
		
		Thread.sleep(1000);
		
		Select s = new Select(AllButton);
		s.selectByIndex(1);
		
		List <WebElement> AllList = s.getOptions();
		
		System.out.println(AllList.size());
		//AllList.size();
		System.out.println();
		for(WebElement i:AllList)
		{
			System.out.println(i.getText());
			
		}
		
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		ListBox3 object = new ListBox3();
		object.BrowserOpen("https://www.91mobiles.com/");
		Thread.sleep(1000);
		
		object.LB();
		Thread.sleep(1000);
		
		object.BrowserClose();
		
		

		
		
	}

}
