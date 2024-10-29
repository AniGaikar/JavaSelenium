package seleniumOpenBrowser;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForTitleUrl {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//		String value = driver.getTitle();
//		
//		System.out.println(value);
		
//		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
//		if(wait.until(ExpectedConditions.titleContains("Account"))) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
//		}
		
		waitTitleContainsAndFetch(10, "Account");
		
		waitForURLContainsAndFetch(10, ".com");
		
		waitForURLIsAndFetch(5, "https://naveenautomationlabs.com/opencart/index.php?route=account/login");

	}
	
	public static String waitTitleContainsAndFetch(int timeOut,String value) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleContains(value));
		return driver.getTitle();
	}
	
	public static String waitTitleGetAndFetch(int timeOut,String value) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.titleIs(value));
		return driver.getTitle();
	}
	
	public static void waitForURLContainsAndFetch(int timeOut,String value) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlContains(value));
		driver.getCurrentUrl();
	}
	
	
	public static String waitForURLIsAndFetch(int timeOut, String urlValue) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		wait.until(ExpectedConditions.urlToBe(urlValue));
		return driver.getCurrentUrl();
	}



}
