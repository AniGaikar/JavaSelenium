package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SliderActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("http://jqueryui.com/resources/demos/slider/default.html");

		Actions act = new Actions(driver);

		WebElement slider = driver.findElement(By.cssSelector("div[id='slider']"));

		act.click(slider).build().perform();

		int x = slider.getSize().getWidth();
		int y = slider.getSize().getHeight();

		System.out.println(x);
		System.out.println(y);

//		Thread.sleep(3000);
//
//		act.moveToElement(slider, -(x / 2) - 200, 0).click().build().perform();

		Thread.sleep(3000);

		act.clickAndHold(slider).moveByOffset((x/2-40), 0).build().perform();

	}

}
