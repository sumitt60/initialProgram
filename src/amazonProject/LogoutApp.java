package amazonProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutApp {

	
	@FindBy (xpath=("//span[text()='Account & Lists']"))	private WebElement AccountAndLists;
	@FindBy (xpath=("//span[text()='Sign Out']"))	private WebElement SignOutButton;	
	
	
	public LogoutApp(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void Logout(WebDriver driver)
	{
		
		UtilityClass.ActionsOps(driver, AccountAndLists);
		SignOutButton.click();
		
	}
	
}
