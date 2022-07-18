package annotates;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DP1Test {
	
	
	@DataProvider(name = "Data", parallel = true)
	public Object[][] method()
	{
		
		return new Object[][] {{"Sumit"}, {"Swara"}, {"Renuka"},  {"Todkare"}};
		
	}

	
	@Test (dataProvider = "Data")
	public void testM(String data)
	{
		System.out.println(data);
	}
}
