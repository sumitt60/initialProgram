package july2022;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginDataProvider {
	
	
	/*@FindBy (xpath=("//input[@id=\"txtUsername\"]"))	private WebElement loginText;
	@FindBy (xpath=("//input[@id=\"txtPassword\"]"))	private WebElement passText;
	@FindBy (xpath=("//input[@value=\"LOGIN\"]"))	private WebElement loginButton;
	
	//WebDriver driver;
	
	public  LoginPage1(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	*/
	
	
	@Test (dataProvider = "LoginTestData")
	public void TestLogin(String userName, String password)
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverManager
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys(userName);
		driver.findElement(By.xpath("//input[@id=\"txtPassword\"]")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value=\"LOGIN\"]")).click();
		
		
		
		
		
	}
	
	
	@DataProvider(name="LoginTestData", parallel = true)
	public Object[][] LoginData()
	{
		
		Object[][] data = new Object[2][2];
		
		data[0][0] = "Admin";
		data[0][1] = "admin123";
		
		
		data[1][0] = "NonAdmin";
		data[1][1] = "admin123";
		
		return data;
		
	}
	
}
