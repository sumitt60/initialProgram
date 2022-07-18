package projectNetflix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileViewPage {
	
	
	@FindBy (xpath="(//div[contains(@class,'list-profiles')])[2]") private WebElement profileList;
	
	public ProfileViewPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean profileVisible()
	{
		if(profileList.isDisplayed() == true)
		{
			return true;
		}
		else
			return false;
		
	}

}
