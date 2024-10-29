package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class InfinteScroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();

		driver.get("https://scrollmagic.io/examples/advanced/infinite_scrolling.html");

		try {
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    long lastHeight = (long) js.executeScript("return document.body.scrollHeight");

		    while (true) {
		    	
		    	List<WebElement> boxlist = driver.findElements(By.cssSelector("div#content div.box1"));
		    	
		    	for(WebElement e: boxlist) {
		    		String color = e.getCssValue("background-color");
		    		System.out.println(color);
		    	}
		    	
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");

		        Thread.sleep(3000);

		        long newHeight = (long) js.executeScript("return document.body.scrollHeight");
		        if (newHeight == lastHeight) {
		            break;
		        }
		        lastHeight = newHeight;
		    }

		} catch (InterruptedException e) {
		    e.printStackTrace();
		}
	}

}
