package selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HiddenElements {


	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
		driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
		
		List<WebElement> ls= driver.findElements(By.id("male"));
		System.out.println(ls.size());
			for(int i=0; i<ls.size(); i++)	
			{
				WebElement e=ls.get(i);
		int x= e.getLocation().getX();
		int y=e.getLocation().getY();
				if(x>0 || y>0)
				{
					System.out.println(x);
					e.click();
			    }
		     }
	}
}
