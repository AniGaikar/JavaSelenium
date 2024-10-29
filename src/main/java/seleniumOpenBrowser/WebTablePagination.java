package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class WebTablePagination {

	static WebDriver driver;

	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}

	public static void selectcountry(String country) {
		driver.findElement(By.xpath("//td[text()='" + country + "']/ancestor::tr/td/input")).click();
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new FirefoxDriver();

		driver.get("https://selectorshub.com/xpath-practice-page/");

		Thread.sleep(3000);

		scrollDown();

		WebElement scroll = driver.findElement(By.xpath("//h2[@id='tablepress-1-name']"));

		WebTablePagination.scrollIntoView(scroll);
		

		Thread.sleep(3000);

//		WebElement select = driver.findElement(By.xpath("//td[text()='Denmark']"));
//		
//		driver.findElement(RelativeLocator.with(By.xpath("//input[@type='checkbox']")).toLeftOf(select)).click();

		while (true) {
			if (driver.findElements(By.xpath("//td[text()='Russia']")).size() > 0) {
				selectcountry("Russia");
				break;
			} else {
//				pagination logic:
				WebElement next = driver.findElement(By.linkText("Next"));
					
					if(next.getAttribute("class").contains("disabled")) {
						System.out.println("pagination is over...country is not found....");
						break;
					}
				
				next.click();
				//Thread.sleep(3000);

		}

	}
}
}
