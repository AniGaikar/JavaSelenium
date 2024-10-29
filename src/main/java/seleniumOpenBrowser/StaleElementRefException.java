package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementRefException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// what is staleElement
		// A stale element refers to an element that is no longer attached to the DOM
		// (Document Object Model) of the page. This typically occurs in scenarios such
		// as when the page is refreshed or updated dynamically. For example, if a page
		// is refreshed, the previous references to elements become invalid because the
		// DOM is reconstructed, leading to a StaleElementReferenceException. This
		// exception indicates that the element you were trying to interact with is no
		// longer valid or accessible.

		WebDriver driver = new FirefoxDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");// DOM v1 -- 100

		WebElement fn = driver.findElement(By.id("input-email"));// v1

		fn.sendKeys("naveen@gmail.com");// v1

		driver.navigate().refresh();

		fn=driver.findElement(By.id("input-email"));// v1

		fn.sendKeys("Anirudha@gmail.com");// v1
	}

}
