package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TotalLink {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com");
		
		//find all links on the page
		List<WebElement> linkCount = driver.findElements(By.tagName("a"));
		
		//print total link value
		int count= linkCount.size();
		System.out.println(count);
		
		//print the text of each link
		for(int i=0;i<count;i++) {
			String linkText=linkCount.get(i).getText();
			System.out.println(linkText);
		}
		
		//FE vs  FEs
		//we    list<webElement>
		//NSE     Empty list--> size
		//action  no actions

	}

}
