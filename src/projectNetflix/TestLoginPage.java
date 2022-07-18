package projectNetflix;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;

public class TestLoginPage extends BaseClassNetflix{

	NeflixLoginPage login;
	ProfileViewPage Profile;
	
	@BeforeClass
	public void OpenBrowser()
	{
		BrowserInitiation(); //Opens Browser and go to Netflix Login Page	
	}
	
	@BeforeMethod()
	public void LoginApplication()
	{
		login.EnterEmailorNumber();
		login.EnterPassword();
		login.ClickSignInButton();
	}
	
	@Test
	public void TestLogin()
	{
		Assert.assertTrue(Profile.profileVisible(), "Profile List is Visble || Login Successful");
	}
	
	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus() == ITestResult.SUCCESS)
		{
			System.out.println("Login is Successful");
		}
		else
		{
			System.err.println("Login Unsuccessful");
			System.out.println(result.getThrowable());
		}
	}
	
	@AfterClass
	public void ShutBrowser()
	{
		CloseBrowser();
	}
}
