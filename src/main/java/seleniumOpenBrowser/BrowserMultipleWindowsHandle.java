package seleniumOpenBrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserMultipleWindowsHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String parentWindowId = driver.getWindowHandle();

		Thread.sleep(3000);

		WebElement link = driver.findElement(By.xpath("//a[contains(@href,'linkedin')]"));

		WebElement face = driver.findElement(By.xpath("//a[contains(@href,'facebook')]"));

		WebElement twitter = driver.findElement(By.xpath("//a[contains(@href,'twitter')]"));

		WebElement youtube = driver.findElement(By.xpath("//a[contains(@href,'youtube')]"));

		link.click();
		face.click();
		twitter.click();
		youtube.click();

		Set<String> handle = driver.getWindowHandles();

		Iterator<String> it = handle.iterator();

		while (it.hasNext()) {
			String windowNo = it.next();
			System.out.println(windowNo);
			driver.switchTo().window(windowNo);
			System.out.println(driver.getCurrentUrl());

			if (!windowNo.equals(parentWindowId)) {
				driver.close();
			}
		}
		
		driver.switchTo().window(parentWindowId);
		System.out.println("parent window url:" + driver.getCurrentUrl());
	}

}
