package seleniumOpenBrowser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverWaitWithElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.freshworks.com/");
		
//		WebElement footer = driver.findElement(By.tagName("footer"));
//		List<WebElement> links = footer.findElements(By.tagName("a"));
//
//		
//		int count = links.size();
//		System.out.println(count);
//		
//		for(WebElement e: links) {
//			String text = e.getAttribute("href");
//			System.out.println(text);
		
		By footer = By.tagName("footer");
			
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		List<WebElement>yoo = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(footer));
			
		}

	}


