package seleniumOpenBrowser;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts_PopUp {

	static WebDriver driver;

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doClick(By locator) {
		getElement(locator).click();
	}

	public static void doSendKey(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public static String getTexted(By locator) {
		return getElement(locator).getText();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();
          
		//=========================Alert Box==============================
//		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
//
//		By alterBox = By.xpath("//input[@value='Show alert box']");
//
//		Thread.sleep(3000);
//
//		doClick(alterBox);
//		
//		Alert alert=driver.switchTo().alert();
//		
//		String popup = alert.getText();
//		
//		System.out.println(popup);
//		
//		Thread.sleep(3000);
//		
//		alert.accept();
		
		//=======================Confirm Box================================
//		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");
//
//		By alterBox = By.xpath("//input[@value='Show confirm box']");
//
//		Thread.sleep(3000);
//
//		doClick(alterBox);
//		
//		Alert alert=driver.switchTo().alert();
//		
//		String popup = alert.getText();
//		
//		System.out.println(popup);
//		
//		Thread.sleep(3000);
//		
//		alert.dismiss();
		
		//============================prompt box=======================
		
		driver.get("https://testpages.herokuapp.com/styled/alerts/alert-test.html");

		By alterBox = By.xpath("//input[@value='Show prompt box']");

		Thread.sleep(3000);

		doClick(alterBox);
		
		Alert alert=driver.switchTo().alert();
		
		String popup = alert.getText();
		
		alert.sendKeys("love you");
		
		System.out.println(popup);
		
		Thread.sleep(3000); 
		
		alert.accept();



	}

}
