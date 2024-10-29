package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NewWindowHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parent = driver.getWindowHandle();

//		driver.switchTo().newWindow(WindowType.TAB);

		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://www.google.com");
		
		Thread.sleep(3000);

		driver.close();
		
		driver.switchTo().window(parent);
		
		WebElement link = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));
		
		String linkdin = driver.getWindowHandle();
		
//		driver.switchTo().window(linkdin);
		
		link.click();
		
		driver.close();
		
		driver.switchTo().window(linkdin);

	}

}
