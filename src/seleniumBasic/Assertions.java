package seleniumBasic;

import org.testng.Assert;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Assertions {
	
	
	@Test 
	//(enabled = false)
	public void test1()
	{
		
		String s1 = "Sumit";
		String s2 = "Todkare";
		Assert.assertNotEquals(s1, s2);
//		Assert.assertEquals(s1, s2, "Not Equals");
		
	}
	
	@Test
	public void test2()
	{
		String s1 = "Swara";
		String s2 = "Swara";
		Assert.assertEquals(s1, s2, "Strings Equal");
	}
	
	@AfterMethod
	public void tes2After(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			System.out.println("Test Failed");
		}
		else if (result.getStatus() == ITestResult.SKIP)
		{
			System.out.println("Test Skipped");
		}
		else
		{
			System.out.println("Test Passed");
		}
		
	}
}
