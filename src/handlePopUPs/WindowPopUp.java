package handlePopUPs;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class WindowPopUp {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Actions act = new Actions(driver);
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		//input[contains(@name,"NewTab")]
		WebElement NewTab = driver.findElement(By.xpath("//input[contains(@name,\"NewTab\")]"));
		System.out.println(driver.getWindowHandle());
		
		act.click(NewTab).perform();
		
		System.out.println(driver.getWindowHandle());

		Set<String> object = driver.getWindowHandles();
		ArrayList<String> handles = new ArrayList<String>(object);
		
		String mainWindow = handles.get(0);
		String childWindow = handles.get(1);
		
		System.out.println("Main Window: "+mainWindow+" "+ "New Tab: "+childWindow);
		
		driver.switchTo().window(childWindow);
		
		//span[contains(text(),"Training")]
		
		driver.findElement(By.xpath("//span[contains(text(),\"Training\")]")).click();
		
		Thread.sleep(1000);
		driver.close();
	
		driver.switchTo().window(mainWindow);
		
		//input[contains(@name,"NewWindow")]
		
		driver.findElement(By.xpath("//input[contains(@name,\"NewWindow\")]")).click();
		
		Set <String> newWindow = driver.getWindowHandles();
		ArrayList<String> newWindowID = new ArrayList<String>(newWindow);
		
		newWindowID.get(1);
		
		driver.switchTo().window(newWindowID.get(1));
		driver.manage().window().maximize();
		Thread.sleep(1000);
		TakesScreenshot screenshot = (TakesScreenshot)driver;
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\SUMIT\\Dropbox\\PC\\Desktop\\Automation Testing QnA\\newWindow.png");
		FileHandler.copy(src, dest);
		
		driver.close();
		
		driver.switchTo().window(newWindowID.get(0));
		Thread.sleep(1000);
		driver.close();
		
		
	}

}
