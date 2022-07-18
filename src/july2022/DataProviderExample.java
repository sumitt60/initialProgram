package july2022;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderExample {

	
	@DataProvider(name="DP")
	public Object[][] method1()
	{
		return new Object[][] {{"Data1"}, {"Data2"}, {"Data3"}};
	}
	
	@Test (dataProvider = "DP")
	public void TestClass(String Data)
	{
		System.out.println(Data);
	}
	
}
