package testngDemo;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo1 {

	
	@Test (priority = 2)
	public void m1()
	{
		
		Reporter.log("Runnig m1",true);
		
	}
	
	@Test (priority = 1)
	public void m2()
	{
		
		Reporter.log("Running m2", true);
		
	}
	
	@Test
	public void TC()
	{
		
		Reporter.log("Running TC", true);
		
	}
}
