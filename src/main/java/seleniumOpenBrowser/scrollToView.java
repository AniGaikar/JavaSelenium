package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class scrollToView {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");				
		
//		WebElement ele = driver.findElement(By.xpath("//span[text()='Best Sellers in Computers & Accessories']"));
		
		JavaScriptUtil jj = new JavaScriptUtil(driver);
		
//		Thread.sleep(3000);
		
//		jj.scrollIntoView(ele);
		
		WebElement clicks = driver.findElement(By.linkText("Registry"));
		
		jj.clickJS(clicks);

	}

}
