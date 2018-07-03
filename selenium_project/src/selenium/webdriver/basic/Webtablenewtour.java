 package selenium.webdriver.basic;

import java.util.List;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtablenewtour {

	@Test
	public void newtour(){
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		driver.findElementByXPath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table");
		
		WebElement tabletr= driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table"));
		
		List<WebElement> ls= tabletr.findElements(By.xpath("/html/body/div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr"));
		
		System.out.println(ls.size());
		
		for(int i=0; i<ls.size(); i++){
			
			System.out.println(ls.get(i).getText());
		}
		
	
		
	}
}
