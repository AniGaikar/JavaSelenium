package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalendarHandle {

	static WebDriver driver;

//	@SuppressWarnings("unlikely-arg-type")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		WebDriverManager.chromedriver().setup();
		driver = new FirefoxDriver();

		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-handle-calendar-in-selenium.html");

		By calenderF = By.id("datepicker");
//		By selectDated = By.cssSelector("table.ui-datepicker-calendar a");

		getElement(calenderF).click();
//		selectDate(selectDated, "15");

		selectFutureYearMonth("February 2025", "32");

	}

	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}

	public static void selectDate(By locator, String value) {
		List<WebElement> text = getElements(locator);

		int count = text.size();

		for (WebElement e : text) {
			String cal = e.getText();
			System.out.println(cal);
			if (cal.contains(value)) {
				e.click();
			}
		}
	}
	
	public static void selectFutureYearMonth(String monthYear,String date) {
		
		if(monthYear.contains("February")&& Integer.parseInt(date)>29) {
			System.out.println("This month doesnt contain this date");
		}
		
		if(Integer.parseInt(date)>32) {
			System.out.println("invalid date enter");
		}
		
		String getMonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();

		System.out.println(getMonthYear);

		while (!getMonthYear.equals(monthYear)) {
			driver.findElement(By.xpath("//span[text()='Next']")).click();

			getMonthYear = driver.findElement(By.className("ui-datepicker-title")).getText();
		}
		
		By selectDated = By.cssSelector("table.ui-datepicker-calendar a");
		selectDate(selectDated, date);
	}
	

}
