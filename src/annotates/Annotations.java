package annotates;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Annotations {
	
	
	@DataProvider(name = "DP")
	public Object[][] dataProviderMethod()
	{
		return new Object[][] {{"data 1"}, {"data 2"}, {"data 3"}, {"data 4"}};
		 
	}

	
	@Test (dataProvider = "DP")
	public void TestMethod(String data)
	{
		System.out.println(data);
		
	}
	
}
