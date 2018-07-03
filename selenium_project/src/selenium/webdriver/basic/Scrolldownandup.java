package selenium.webdriver.basic;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolldownandup {

	

	WebDriver driver;
	@Test
	public void scroll(){
		try {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			Thread.sleep(10000);
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");
			//scroll(horizontal, vertical);
			//scroll down -> positive and up is negative
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
