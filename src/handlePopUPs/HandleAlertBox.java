package handlePopUPs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumBasic.OpenChromeBrowser;

public class HandleAlertBox extends OpenChromeBrowser{

	
	public void EnterInfo()
	{
		
		//input[@name='cusid']
		
		WebElement e, submit;
		e = driver.findElement(By.xpath("//input[@name='cusid']"));
		e.sendKeys("12345");
		
		//input[@name='submit']
		
		submit = driver.findElement(By.xpath("//input[@name='submit']"));
		submit.click();
		
	}
	
	public void AlertBox() throws InterruptedException
	{
		
		Alert alt = driver.switchTo().alert();
		String text = alt.getText();
		System.out.println(text);
		alt.accept();
		Thread.sleep(1000);
		String text1 = alt.getText();
		System.out.println(text1);
		alt.accept();
	
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		HandleAlertBox object = new HandleAlertBox();
		object.BrowserOpen("https://demo.guru99.com/test/delete_customer.php");
		Thread.sleep(1000);
		object.EnterInfo();
		Thread.sleep(1000);
		object.AlertBox();
		Thread.sleep(1000);
		object.BrowserClose();
	}

}
