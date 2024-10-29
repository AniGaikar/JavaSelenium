package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorConcept {

	static WebDriver driver;
	// but when you delecraed it in class with static its unassicble to main method

	public static void main(String[] args) { 
		// TODO Auto-generated method stub

		// create a webelemt + perform action(click,sendkey,getext,isdisplayed...)

		// create a webement : need a locator

		driver = new FirefoxDriver();

		driver.get("https://qa.sugarcosmetics.com/account");

		driver.manage().window().maximize();

//		1.method
//		driver.findElement(By.id("outlined-start-adornment")).sendKeys("9892098920");

//		2.method
//		WebElement phoneNumber = driver.findElement(By.id("outlined-start-adornment"));
//		phoneNumber.sendKeys("9892098920");

//		3.method: By locator
//		By phoneNumber = By.id("outlined-start-adornment"); //here we just created refer variable and we dont hit the server
//		// if you want to hit server,you need to create Webelement
//		
//		WebElement pNumber = driver.findElement(phoneNumber);
//		
//		pNumber.sendKeys("9892098920");

//		4.method: by locator+genric method
//		By emailID = By.id("outlined-start-adornment");
//
//		getElement(emailID).sendKeys("9892098920");
		
//		5.Method
//		By phoneNumber = By.id("outlined-start-adornment");
		
//		doSendKeys(phoneNumber, "9892098920");
		
		By phoneNumber = By.id("outlined-start-adornment");
		
		ElementUtil pNumber = new ElementUtil(driver);
		
		pNumber.doSendKeys(phoneNumber, "9892098920");

	}


}
