package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NestedFrames {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://selectorshub.com/iframe-scenario/");
		
		Thread.sleep(3000);

//		driver.switchTo().frame("pact1");
//		
//		driver.findElement(By.id("inp_val")).sendKeys("What's");
		
//		driver.switchTo().frame("pact1");	
//		driver.switchTo().frame("pact2");
//
//		driver.findElement(By.id("jex")).sendKeys("love");
		
		driver.switchTo().frame("pact1");	
		driver.switchTo().frame("pact2");
		driver.switchTo().frame("pact3");
		
		driver.findElement(By.id("glaf")).sendKeys("baby dont hurt me");
		
		
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.findElement(By.id("inp_val")).sendKeys("What's");
		
		driver.switchTo().defaultContent();

	}

}
