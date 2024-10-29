package seleniumOpenBrowser;

import javax.swing.text.Document;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ZoomInZoomOut {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		JavascriptExecutor js =(JavascriptExecutor) driver;
		String zoom = "document.body.style.MozTransform = 'scale(0.5)'";
		js.executeScript(zoom);

	}

}
