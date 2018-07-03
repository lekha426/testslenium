package selenium.webdriver.basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Radiobutton {
	
	@Test
	public void radio(){
	WebDriver driver = new ChromeDriver();
	driver.get("http://seleniumpractise.blogspot.in/2016/08/how-to-automate-radio-button-in.html");
	
	List <WebElement>ls = driver.findElements(By.xpath("//input[@name='lang' and @type='radio']"));
	for(int i=0; i<ls.size(); i++){
		String word = ls.get(i).getAttribute("value");
		
		if(word.equalsIgnoreCase("python")){
			ls.get(i).click();
		break;	
		}
	}
	}

}   
