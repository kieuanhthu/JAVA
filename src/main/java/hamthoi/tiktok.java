package hamthoi;

import org.openqa.selenium.chrome.ChromeDriver;

public class tiktok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win64\\chromedriver");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.tiktok.com/@tiktok");
		
	}

}
