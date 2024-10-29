package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClickHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");

		WebElement rCilck = driver.findElement(By.xpath("//span[text()='right click me']"));

		Actions act = new Actions(driver);

		act.contextClick(rCilck).build().perform();

		List<WebElement> rClickElement = driver
				.findElements(By.xpath("//ul[contains(@class,'list context-menu-root')]//li/span"));

//		

		for (WebElement e : rClickElement) {
			String text =e.getText();
			System.out.println(text);
		
			act.contextClick(rCilck).build().perform();
			act.click(e).build().perform();
			Thread.sleep(2000);
			Alert mm = driver.switchTo().alert();
			String rr=mm.getText().toString();
			System.out.println(rr );
			Thread.sleep(4000);
			mm.accept();
	

		}

	}

}
