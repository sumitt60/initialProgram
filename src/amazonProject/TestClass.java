package amazonProject;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass extends BaseClass{
	
	LoginPage LP;
	BaseClass bc;
	LogoutApp logout;
	
	@BeforeClass
	public void OpenBrowserforAmazon()
	{
		inBrowser();
		LP = new LoginPage(driver);
		logout = new LogoutApp(driver);
	}
	
		
	@BeforeMethod
	public void LoginAmazon() throws IOException
	{
		
		LP.AmzLogin();
		LP.enterEmail(UtilityClass.getDatafromProp("UN"));
		
		LP.ClickContinueButton();
		LP.EnterPassword(UtilityClass.getDatafromProp("Password"));
		LP.ClickSignInButton();
	}
	
	
	@Test
	public void TestMethod()
	{
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		Reporter.log("Test Case Executed: Login Successful", true);
	}
	
	
	@AfterMethod
	public void logout()
	{
		
		logout.Logout(driver);
	}
	
	@AfterClass
	public void CloseBrowser()
	{
		outBrowser();
	}
	
	
	
	

}
