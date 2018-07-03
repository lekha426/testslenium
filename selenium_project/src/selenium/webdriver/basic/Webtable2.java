package selenium.webdriver.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Webtable2 {

	
	@Test
	public void newtour(){
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com");
		
		WebElement table =driver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[2]/td[1]/table[1]/tbody/tr[3]/td/table/tbody"));
		
		List <WebElement> tr= table.findElements(By.tagName("tr"));
	
		int row_count= tr.size();
		
		for(int row=0; row<row_count; row++){
			List <WebElement> td= tr.get(row).findElements(By.tagName("td"));
			
			
			for(int col=0; col<td.size(); col++){
				System.out.println(td.get(col).getText());
			}
		}
		
	}
}
 //7997633335