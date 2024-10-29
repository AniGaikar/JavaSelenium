package seleniumOpenBrowser;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SaucedemoLab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.saucedemo.com/v1/inventory.html");

		List<WebElement> price = driver.findElements(By.cssSelector("div.inventory_item_price"));

//		price.stream().forEach(e->System.out.println(e.getText()));

//		price.stream().map(e-> Double.parseDouble(e.getText().substring(1))).forEach(e->System.out.println(e));

		List<Double> collect = price.stream().map(e -> Double.parseDouble(e.getText().substring(1))).sorted()
				.collect(Collectors.toList());

		System.out.println(collect);// this storing is in asc order;

		List<Double> collectDesc = price.stream().map(e -> Double.parseDouble(e.getText().substring(1)))
				.sorted(Comparator.reverseOrder()).collect(Collectors.toList());

		System.out.println(collectDesc);

	}

}
