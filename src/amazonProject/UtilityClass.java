package amazonProject;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class UtilityClass {

	
	public static String getDatafromProp(String key) throws IOException
	{
		
		FileInputStream file = new FileInputStream("C:\\Users\\SUMIT\\eclipse-workspace\\SeleniumProject\\src\\amazonProject\\PropertyFile.properties");
		
		Properties prop = new Properties();
		
		prop.load(file);
		
		
		String value = prop.getProperty(key);
		return value;
		
		
		
	}
	
	public static void ActionsOps(WebDriver driver, WebElement element)
	{
		
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
		
	}
	
	
	
	
}
