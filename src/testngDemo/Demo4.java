package testngDemo;

import org.testng.Reporter;
import org.testng.annotations.BeforeClass;

public class Demo4 {
	
	@BeforeClass
	public void Browser()
	{
		
		Reporter.log("Opening Browser",true);
		
	}

}
