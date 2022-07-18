package seleniumBasic;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.*;
import org.testng.log4testng.Logger;

public class Log4j {

	
	Logger log = Logger.getLogger(getClass());
	
	@Test
	public void method()
	{
		
		String name = "Sumit";
		String otherName = "Sam";
		Assert.assertNotEquals(name, otherName);
		Assert.assertEquals(name, otherName);
		log.info(name+" "+otherName+" Do Not Match");
		
					
	}
	
	@AfterMethod
	public void results(ITestResult result)
	{
		
		if(result.getStatus() == ITestResult.FAILURE)
		{
			System.out.println("Results Throwable: "+result.getThrowable());
		}
		else
		{
			System.out.println("ram ram");
		}
		
	}
	
	
}
