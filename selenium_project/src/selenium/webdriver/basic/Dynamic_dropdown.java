package selenium.webdriver.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Dynamic_dropdown {
	
	@Test
	public void dropdown(){
	ChromeDriver driver= new ChromeDriver();
	
	driver.get("http://seleniumpractise.blogspot.in/2016/08/bootstrap-dropdown-example-for-selenium.html");
	
	driver.findElement(By.id("menu1")).click();
	
	WebDriverWait wait = new WebDriverWait(driver, 50);

	WebElement element = wait
			.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//ul[@class='dropdown-menu']/li/a")));

	//*[@id="post-body-4615304122771162527"]/div[1]/div/ul/li[1]/a
	List <WebElement>ls =driver.findElements(By.xpath("//ul[@class='dropdown-menu']/li/a"));
	
	for( int i=0; i<ls.size(); i++){
	System.out.print(ls.get(i).getAttribute("innerHTML")+ "</br>");
	
	}
	}

}
