package selenium.webdriver.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown_select {
	
//select dropdown text and select all links in fb page
	public static void main(String[] args) {

		try {
			//System.setProperty("webdriver.chrome.driver", "C:\\Users\\kodali\\Downloads\\selenium\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com");
			List <WebElement> ls1 = driver.findElements(By.partialLinkText("a"));
			//List <WebElement> ls2 = driver.findElements(By.tagName("a"));
			 
			System.out.println(ls1.size());
 
			for (int i = 1; i<ls1.size();i++)
 
			{
 
				System.out.println(ls1.get(i).getAttribute("href"));
				System.out.println(ls1.get(i).getText());
 
			}
			
			
			Thread.sleep(1000);
			
			Select dropdown =new Select(driver.findElementById("month"));
			List<WebElement> dd= dropdown.getOptions();
			for(int j=0; j<dd.size(); j++){
				System.out.println(dd.get(j).getText());
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
