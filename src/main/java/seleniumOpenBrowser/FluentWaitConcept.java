package seleniumOpenBrowser;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitConcept {

	static WebDriver driver;

	public static void main(String[] args) {
		
		//WebDriverWait --> FluentWait ---> Wait
		
				driver = new FirefoxDriver();
				driver.get("https://www.freshworks.com/");
				By freeTrial = By.cssSelector("a[title='Free Trial11']");
				
//				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				FluentWait wait = new FluentWait(driver);
				wait.withTimeout(Duration.ofSeconds(10));
				wait.ignoring(NoSuchElementException.class);
				wait.pollingEvery(Duration.ofSeconds(2));
				
	}
}
