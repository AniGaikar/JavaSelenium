package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StaleElementRefExceptionFE {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.espn.in/nba/");
		
		List<WebElement> links = driver.findElements(By.xpath("(//h2[text()='Quick Links']//parent::header//following-sibling::ul)[last()]/li"));
		
	for(int i=0; i<links.size();i++) {
		links.get(i).click();
		driver.navigate().back();
//		String text =e.getText();
//		WebElement fLink=driver.findElement(By.tagName("a"));
//		String linkText =fLink.getAttribute("href");
//		System.out.println(text);
//		System.out.println(linkText);
		Thread.sleep(2000);
		links =  driver.findElements(By.xpath("(//h2[text()='Quick Links']//parent::header//following-sibling::ul)[last()]/li"));

	}

	}

}
