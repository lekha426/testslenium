package selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;


public class Mousehover {
	
	@Test
	public void mouse(){
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("https://www.facebook.com");
	WebElement e= driver.findElement(By.id("birthday-help"));
//create an object action of an action class
	Actions a= new Actions(driver);
	//mouse hover to an element
	a.moveToElement(e).perform();
	}
}
