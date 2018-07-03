package selenium.webdriver.basic;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class recaptcha1 {

	public static void main(String[] args) {
		
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kodali\\Downloads\\selenium\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.irctc.co.in/eticketing/home");
			Thread.sleep(5000);
			driver.findElementByName("j_username").sendKeys("vigraha");
			driver.findElementByName("j_password").sendKeys("vigraha");
			
			Scanner scan= new Scanner(System.in);
			System.out.println("Enter recapthca:" );
			String captcha=scan.nextLine();
			driver.findElementById("nlpAnswer").sendKeys(captcha);
			driver.findElementById("loginbutton").click();
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
