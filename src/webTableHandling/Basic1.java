package webTableHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic1 {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\ChromeDriver exe file\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/zoitgiest-men-printed-casual-white-shirt/p/itm61561837c49f9?pid=SHTG56Z6UFTSBHBJ&lid=LSTSHTG56Z6UFTSBHBJTM89ES&marketplace=FLIPKART&fm=productRecommendation%2Fsimilar&iid=R%3As%3Bp%3ASHTGFBT87UKYQGGD%3Bl%3ALSTSHTGFBT87UKYQGGDLZ5XC9%3Bpt%3App%3Buid%3A1fbb3198-d88e-11ec-8dd8-45271607f657%3B.SHTG56Z6UFTSBHBJ&ppt=pp&ppn=pp&ssid=pia5drujqo0000001653086521084&otracker=pp_reco_Similar%2BProducts_4_33.productCard.PMU_HORIZONTAL_Zoitgiest%2BMen%2BPrinted%2BCasual%2BWhite%2BShirt_SHTG56Z6UFTSBHBJ_productRecommendation%2Fsimilar_3&otracker1=pp_reco_PINNED_productRecommendation%2Fsimilar_Similar%2BProducts_GRID_productCard_cc_4_NA_view-all&cid=SHTG56Z6UFTSBHBJ");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//span[text()='Size Chart']
		
		driver.findElement(By.xpath("//span[text()='Size Chart']")).click();
		
		Thread.sleep(1000);
		

		//table[@class='_2WObml']/tbody/tr[2]/td[3]
		
		
		WebElement size = driver.findElement(By.xpath("//table[@class='_2WObml']/tbody/tr[2]/td[3]"));
		
		String data = size.getText();
		System.out.println("Brand Size: "+ data);
		
		
		
		System.out.println("Number of Columns: "+driver.findElements(By.xpath("//table[@class='_2WObml']/tbody/tr[2]/td")).size());
		System.out.println("Number of Rows: "+driver.findElements(By.xpath("//table[@class='_2WObml']/tbody/tr")).size());
		Thread.sleep(1000);
	
		driver.close();
	
	}
	

}
