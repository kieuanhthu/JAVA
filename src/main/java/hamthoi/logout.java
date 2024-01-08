package hamthoi;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class logout {


public static void main( String[] args ) throws InterruptedException
{
	String name = "rahul";
	System.setProperty("Webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win64\\chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	String password = getPassword(driver);
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	driver.findElement(By.name("inputPassword")).sendKeys(password);
	driver.findElement(By.className("signInBtn")).click();
	Thread.sleep(1000);
	System.out.println(driver.findElement(By.tagName("p")).getText());
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(),"You are successfully logged in.");
	Assert.assertEquals(driver.findElement(By.cssSelector("div h2")).getText(),"Hello " +name+ ",");
	driver.findElement(By.xpath("//button[text()='Log Out']")).click();
	driver.close();

}
public static String getPassword(WebDriver driver) throws InterruptedException

{

	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	driver.findElement(By.linkText("Forgot your password?")).click();
	Thread.sleep(1000);
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	//Please use temporary password 'rahulshettyacademy' to Login.
	String passwordText = driver.findElement(By.cssSelector("form p")).getText(); 
	String [] passwordArray = passwordText.split("'");
	String password = passwordArray[1].split("'")[0];
	return password;
			
	

} 
}