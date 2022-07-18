package angelBrokingProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PortfolioHomePage {

	
@FindBy(xpath=("//li[@class='dropdown dropdown-hover']/a[1]"))	private WebElement ProfleOptionHover;
@FindBy(xpath=("//a[text()='Logout']"))	private WebElement LogoutOption;
	

	public PortfolioHomePage(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void DropDownHover()
	{
		
		ProfleOptionHover.click();
				
	}
	
	public void LogoutOption()
	{
		
		LogoutOption.click();
		
	}


	
}
