package hamthoi;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class lesson3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win64\\chromedriver");
		ChromeDriver driver = new ChromeDriver();
		//Sibling - child to parent traverse
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
	}

}
