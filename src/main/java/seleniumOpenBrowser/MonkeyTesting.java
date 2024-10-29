package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MonkeyTesting {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.myntra.com/");
		
		List<WebElement> footer = driver.findElements(By.xpath("//div[@class='desktop-shopLinks']//a"));
		
		int size=footer.size();
		
		System.out.println(size);
		
		for(int i =0;i<size;i++) {
			
			int footerRandom = (int) Math.floor(Math.random()*size);
			
			WebElement e = footer.get(footerRandom);
			String text = e.getText();
			System.out.println(text);
			e.click();
			driver.navigate().back();
			 footer = driver.findElements(By.xpath("//div[@class='desktop-shopLinks']//a"));
		}
		
		
	}

}
