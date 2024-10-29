package seleniumOpenBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		By loginBtn = By.xpath("//input[@value='Login']");
		
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		
//		WebElement passWordWait =wait.until(ExpectedConditions.presenceOfElementLocated(password));
//		
//		passWordWait.sendKeys("99999");
		
		waitForElementPresence(password, 10).sendKeys("8888888");

	}
	
	/**
	 * * An expectation for checking that an element is present on the DOM of a page.
	 * This does not necessarily mean that the element is visible.s
	 * @param locator
	 * @param timout
	 * @return
	 */
	public static WebElement waitForElementPresence(By locator,int timout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timout));
		return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}
	
	/**
	 * An expectation for checking that an element is present on the DOM of a page
	 * and visible. Visibility means that the element is not only displayed but also
	 * has a height and width that is greater than 0.
	 * @param locator
	 * @param timout
	 * @return
	 */
	public static WebElement waitForElementVisiable(By locator,int timout) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timout));
		return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	

}
