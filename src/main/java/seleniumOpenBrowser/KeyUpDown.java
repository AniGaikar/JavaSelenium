package seleniumOpenBrowser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyUpDown {
	
	static WebDriver driver;
	
//	public static void scrollup() {
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		js.executeScript("window.doucment.scroll", null);
//	}
	
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.com");
		
		Actions act = new Actions(driver);
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.DOWN).perform();
		
		Thread.sleep(2000);
		
		act.keyDown(Keys.CONTROL).sendKeys(Keys.UP).perform();
		
		//scrolling
		

	}

}
