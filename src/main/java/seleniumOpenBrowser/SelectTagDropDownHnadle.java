package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropDownHnadle {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		By country = By.id("Form_getForm_Country");
		
		WebElement countryEle = driver.findElement(country);
		
//		Select select = new Select(countryEle); //we have to write webelement here
//		
////		select.selectByIndex(5);
//		
////		select.selectByValue("India");
//		select.selectByVisibleText("Brazil");
		
		doSelectDropDownByIndex(country, 32);
		
		Thread.sleep(2000);
		
		doSelectDropDownByValue(country,"Brazil");
		
		Thread.sleep(2000);
		
		doSelectDropDownByVisibleText(country,"Oman");

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public static void doSelectDropDownByValue(By locator, String value ) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public static void doSelectDropDownByVisibleText(By locator, String value ) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
