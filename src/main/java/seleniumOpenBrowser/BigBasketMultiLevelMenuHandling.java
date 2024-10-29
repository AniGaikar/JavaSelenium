package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BigBasketMultiLevelMenuHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.bigbasket.com/");

		Actions act = new Actions(driver);

		WebElement shopBy = driver.findElement(By.id("headlessui-menu-button-:R5bab6:"));

		act.click(shopBy).build().perform();
		
		Thread.sleep(3000);

		WebElement moveBeverages = driver.findElement(By.linkText("Beverages"));

		act.moveToElement(moveBeverages).build().perform();
		
		Thread.sleep(3000);

		WebElement moveTea = driver.findElement(By.linkText("Tea"));

		act.moveToElement(moveTea).build().perform();
		
		Thread.sleep(3000);
		
		WebElement moveTeaBag = driver.findElement(By.linkText("Tea Bags"));

		act.moveToElement(moveTeaBag).build().perform();

	}

}
