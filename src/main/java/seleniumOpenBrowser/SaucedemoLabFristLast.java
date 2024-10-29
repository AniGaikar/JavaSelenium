package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SaucedemoLabFristLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.saucedemo.com/v1/inventory.html");

		List<WebElement> price = driver.findElements(By.cssSelector("div.inventory_item_price"));
		
//		double frist = price.stream().map(e->Double.parseDouble(e.getText().substring(1))).findFirst().get();
		
//		System.out.println(frist);
		
double last = price.stream().map(e->Double.parseDouble(e.getText().substring(1))).reduce((first, second)->second).get();
		
		System.out.println(last);

	}

}
