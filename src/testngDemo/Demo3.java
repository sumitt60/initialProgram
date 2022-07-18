package testngDemo;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Demo3 {
	
	
	@BeforeClass
	public void Browser()
	{
		
		Reporter.log("Opening Browser",true);
		
	}
	
	@BeforeMethod
	public void Login()
	{
		
		Reporter.log("Application Login", true);
		
	}
	
	@Test
	public void TestClass()
	{
		String s1 = "Hello";
		String s2 = "Hi";
		
		Assert.assertNotEquals(s1, s2, "String Are Not Equal");		
		//Assert.assertNull(s1, "Not Null");
		Reporter.log("Test Class Execution", true);
		
	}
	
	@Test 
	
	(enabled = false)
	public void TestClass2()
	
	{
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hi";
		
		Assert.assertEquals(s1, s2, "String Are Not Equal");		
		Assert.assertEquals(s1, s3, "String Are Not Equal");
		Reporter.log("Test Class Execution 2", true);
	}
	
	@Test
	public void TestClass3()
	{
		
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "Hi";
		String s4 = "";
		SoftAssert as = new SoftAssert();
		as.assertEquals(s1, s2, "String Are Not Equal");
		as.assertEquals(s1, s3, "String Are Not Equal");
		as.assertNotNull(s1, "String is Not Null");
		as.assertNotNull(s4, "String is Not Null");
		Reporter.log("Test Class 3 Execution", true);
		System.out.println(Reporter.getCurrentTestResult());
		
		
	}
	
	@AfterMethod()
	public void Logout(ITestResult result)
	{
		
		Reporter.log("Logout from Application", true);
		System.out.println(Reporter.getCurrentTestResult());
		int i = result.getStatus();
		System.out.println(i);
		
	}

	@AfterClass()
	public void CloseBrowser()
	{
		Reporter.log("Closing Browser", true);
	}
}
