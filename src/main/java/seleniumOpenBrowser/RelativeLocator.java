package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;


public class RelativeLocator {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		 driver = new FirefoxDriver();
		 
		 driver.get("https://www.numbeo.com/pollution/rankings_by_country.jsp");
			
			Thread.sleep(2000);
			
			WebElement ele = driver.findElement(By.xpath("//td[text()='India']"));
			
			String rightIndex = driver.findElement(with(By.tagName("td")).toRightOf(ele)).getText();

			System.out.println(rightIndex);
			
			String nearIndex = driver.findElement(with(By.tagName("td")).near(ele)).getText();
			
			System.out.println(nearIndex);
			
			String leftIndex = driver.findElement(with(By.tagName("td")).toLeftOf(ele)).getText();
			
			System.out.println(leftIndex);
			
			String below = driver.findElement(with(By.tagName("td")).below(ele)).getText();
			
			System.out.println(below);
	}

}
