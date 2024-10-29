package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementIsDisplayed {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		 driver = new FirefoxDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		boolean flagSearch = driver.findElement(By.name("search")).isDisplayed();
//		if(flagSearch) {
//			System.out.println("pass");
//			driver.findElement(By.name("search")).sendKeys("iphone");
//		}
		
		By search = By.name("search");
		By searchIcon = By.xpath("/html/body/header/div/div/div[2]/div/span/button");
		
		if(getDisplayed(search)) {
			System.out.println("search is present");
			doSendkey(search, "iphone");
			doclick(searchIcon);
		}
		


	}
	public static WebElement getElement(By locator){
		return driver.findElement(locator);
	}
	
	public static boolean getDisplayed(By locater) {
		return getElement(locater).isDisplayed();
	}
	
	public static void doSendkey(By locater, String value) {
		 getElement(locater).sendKeys(value);
	}
	
	public static void doclick(By locater) {
		 getElement(locater).click();
	}

}
