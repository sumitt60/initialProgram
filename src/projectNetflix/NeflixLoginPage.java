package projectNetflix;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NeflixLoginPage {
	
	
	@FindBy (xpath="//input[@id='id_userLoginId']") private WebElement emailIDandNumber;
	@FindBy (xpath="//input[contains(@id,'password')]") private WebElement passwordField;
	@FindBy (xpath="//button[text()='Sign In']") private WebElement SignInButton;
	
	
	public NeflixLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void EnterEmailorNumber()
	{
		emailIDandNumber.sendKeys("sumitt60@gmail.com");
	}
	
	public void EnterPassword()
	{
		passwordField.sendKeys("Qazx007$");
	}
	
	public void ClickSignInButton()
	{
		System.out.println("Sign In Button Enabled: "+SignInButton.isEnabled());
		SignInButton.click();
	}

}
