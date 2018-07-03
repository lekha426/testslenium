package selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Scrolluntil_elementisfound {

	@Test
	public void scrolluntilfound(){
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		
		WebElement found = driver.findElement(By.xpath("//p[contains(text(),'Excepteur sint occaecat cupidatat')]"));
		je.executeScript("arguments[0].scrollIntoView(true);",found);
		System.out.println(found.getText());
		
	}
}
