package seleniumOpenBrowser;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitForJSAlertsPopUp {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/javascript_alerts");

		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		Alert alter = wait.until(ExpectedConditions.alertIsPresent());

		String yo = alter.getText();

		alter.dismiss();

		System.out.println(yo);

	}

	public static Alert waitForAlertPresence(int timeOut) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeOut));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void waitForAlertText(int timeOut) {
		waitForAlertPresence(timeOut).getText();
	}

	public static void waitForAlertAccept(int timeOut) {
		waitForAlertPresence(timeOut).accept();
	}

	public static void waitForAlertDismiss(int timeOut) {
		waitForAlertPresence(timeOut).dismiss();
	}

	public static void waitForAlertSendKey(int timeOut, String value) {
		waitForAlertPresence(timeOut).sendKeys(value);
	}

}
