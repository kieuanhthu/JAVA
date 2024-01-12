package hamthoi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dynamicdropdown {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win64\\chromedriver");
		ChromeDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Thread.sleep(2000);
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.id("ctl00_mainContent_ddl_originStation1_CTXT"))).click();
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@value='BLR']"))).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click(); Khong co element nay be oi có mà bác
		Thread.sleep(2000);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@value='MAA'])[2]"))).click();


		
//		driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
		

		
	}

}
