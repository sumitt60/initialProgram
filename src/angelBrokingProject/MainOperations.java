package angelBrokingProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MainOperations {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://trade.angelbroking.com/login/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		LoginPagePOM LP = new LoginPagePOM(driver);
		System.out.println(driver.getCurrentUrl());
		LP.enterUserID();
		LP.enterPassword();
		LP.SingInButton();
	
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//Thread.sleep(1000);
		
		PortfolioHomePage PH = new PortfolioHomePage(driver);
		System.out.println(driver.getCurrentUrl());
		PH.DropDownHover();
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		PH.LogoutOption();
		
		System.out.println(driver.getCurrentUrl());
		//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Thread.sleep(1000);
		
		//driver.close();

		
	}
	

}
