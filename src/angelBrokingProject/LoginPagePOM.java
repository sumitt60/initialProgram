package angelBrokingProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPagePOM {
	
	
	@FindBy(xpath=("//input[@id='txtUserID']"))			private WebElement UserID;
	@FindBy(xpath=("//input[@id='txtTradingPassword']"))			private WebElement Password;
	@FindBy(xpath=("//a[@id='loginBtn']"))			private WebElement SignInButton;
	
	
	public LoginPagePOM(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}
	
	public void enterUserID()
	{
		
		UserID.sendKeys("sumitt60@gmail.com");
		
	}
	
	public void enterPassword()
	{
		
		Password.sendKeys("Qazx007$");
		
	}
	
	public void SingInButton()
	{
		
		SignInButton.click();
		
	}

}
