package seleniumBasic;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SuitePractice {
	
	@Test (groups="Login")
	public void t1()
	{
		Reporter.log("Running t1", true);
//		Assert.fail("t1 fails");
	}
		
	@Test (groups="Login", dependsOnMethods= {"t1"})
	public void t2()
	{
		Reporter.log("Running t2", true);
	}
	
	@Test (groups="Profile")
	public void t3()
	{
		Reporter.log("Running T3", true);
	}
	
	@Test (groups="Profile")
	public void t4()
	{
		Reporter.log("Running T4", true);
	}
	
	@Test (groups="Order")
	public void t5()
	{
		Reporter.log("Running T5", true);
	}

}
