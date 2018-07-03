package selenium.webdriver.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Calender {

	@Test
	public void cal(){
		WebDriver driver = new ChromeDriver();
		driver.get("http://ksrtc.in/oprs-web/");
		driver.findElement(By.id("txtJourneyDate")).click();
		
		driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[3]/td[5]/a")).click();
	
	}
}
