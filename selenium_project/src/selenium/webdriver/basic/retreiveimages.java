package selenium.webdriver.basic;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class retreiveimages {
	@Test
	public void image() throws IOException{
		try {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.facebook.com");
			Thread.sleep(5000);
			WebElement img= driver.findElement(By.tagName("img"));
			String logoSRC = img.getAttribute("src");
			Thread.sleep(5000);
			 URL imageURL = new URL(logoSRC);
				Thread.sleep(5000);
			 BufferedImage saveImage = ImageIO.read(imageURL);
				Thread.sleep(5000);
			 ImageIO.write(saveImage, "png", new File("./screenshots/krc.png"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
