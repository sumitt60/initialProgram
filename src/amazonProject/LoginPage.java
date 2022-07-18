package amazonProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage  {
	
	
		
	
	//POM STEPS	
	//1. Declaration
	
	@FindBy (xpath=("//span[text()='Account & Lists']"))	private WebElement AccountAndLists;
	@FindBy (xpath=("//span[text()='Sign in']"))		private WebElement SigIn;	
	@FindBy (xpath=("//input[@name='email']"))		private WebElement EnterEmail;
	@FindBy (xpath=("//input[@id='continue']"))	private WebElement ContinueButton;
	@FindBy (xpath=("//input[@id='signInSubmit']")) private WebElement SignInButton;
	@FindBy (xpath=("//input[@id='ap_password']")) private WebElement EnterPassword;
	@FindBy (xpath=("//a[@id='ap_change_login_claim']"))	private WebElement ChangeLoginClaim;
	
	
	//2.Initialization
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3. Utilization
	
	public void AmzLogin()
	{
		AccountAndLists.click();
	}
	
	public void enterEmail(String phone_email)
	{
		EnterEmail.sendKeys(phone_email);
	}
	
	public void ClickContinueButton()
	{
		ContinueButton.click();
	}
	
	public void EnterPassword(String password)
	{
		EnterPassword.sendKeys(password);
	}
		
	public void ClickSignInButton()
	{
		SignInButton.click();
	}
	
	
	
}
