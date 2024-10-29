package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetElementsFromPageSection {
	
	static {
        System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
    }
	
	static WebDriver driver = new ChromeDriver();
	
	public static void lunchBrowser() {
		  driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		  driver.manage().window().maximize();
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetElementsFromPageSection.lunchBrowser();
		
		By link = By.xpath("//aside[@id='column-right']//a");
		List<WebElement> linkCount = getElements(link);
		int count = linkCount.size();
		System.out.println(count);
		
		for(WebElement e:linkCount) {
			String rawLink = e.getAttribute("href");
			String linkText=e.getText();
			System.out.println(rawLink+" : "+linkText );
		}
		
		  

	}

}
