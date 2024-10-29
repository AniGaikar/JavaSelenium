package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.google.com");
		
		WebElement element = driver.findElement(By.name("q"));
		
		Actions act = new Actions(driver);
		
		act.keyDown( element,Keys.SHIFT).sendKeys("pes 2021").build().perform();
		
		//keydown means you have press the key

	}

}
