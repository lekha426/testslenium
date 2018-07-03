package selenium.webdriver.basic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day1 {

	
	WebDriver driver;
	JavascriptExecutor jse;
	
	public void invokeBrowser()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\kodali\\Downloads\\selenium\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize(); 
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			
			driver.get("https://www.amazon.com/ap/signin?_encoding=UTF8&ignoreAuthState=1&openid.assoc_handle=usflex&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&openid.ns.pape=http%3A%2F%2Fspecs.openid.net%2Fextensions%2Fpape%2F1.0&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2F%3Fref_%3Dnav_signin&switch_account=");
			searchCourse();
		} catch (Exception e)
		{
						e.printStackTrace();
		}
	}
	
	public void searchCourse(){
		
		try {
			driver.findElement(By.id("ap_email")).sendKeys("hrullekhakodali@gmail.com");
			driver.findElement(By.id("continue")).click();
			driver.findElement(By.id("ap_password")).sendKeys("Hrullekha123!");
			driver.findElement(By.id("signInSubmit")).click();
			
WebElement dropdown = driver.findElement(By.className("nav-search-dropdown"));
			
			Select dropdownvalue= new Select(dropdown);
			dropdownvalue.selectByVisibleText("Books");

			
			driver.findElement(By.className("nav-input")).click();
			
			driver.findElement(By.id("twotabsearchtextbox")).sendKeys("lekha");
			driver.findElement(By.className("nav-input")).click();
			
		
		List<WebElement> liElements=driver.findElements(By.xpath("//*[@id='s-results-list-atf']/li"));
		 System.out.println(liElements);

	        for(int i=1; i <= liElements.size(); i++)
	        {
	            WebElement linkElement = driver.findElement(By.xpath("//*[@id='s-results-list-atf']/li[" + i + "]"));
	            System.out.println(linkElement.getText());      

	        }
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
	}
	public static void main(String[] args) {
		
		Day1 myObj =new Day1();
		myObj.invokeBrowser();
		
	}

}
