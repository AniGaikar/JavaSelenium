package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableHandling {

	static WebDriver driver;

	public static void selectUserName(String userName) {
		driver.findElement(By.xpath("//td[text()='" + userName + "']/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static String selectUserDate(String username) {
		return driver
				.findElement(
						By.xpath("//td[text()='" + username + "']/ancestor::tr/td[contains(@class,'dt-type-date')]"))
				.getText();
	}

	public static String batmanWicketTaker(String batMan) {
		return driver.findElement(By.xpath("//a[text()='" + batMan
				+ "']/following-sibling::div[contains(@class,'whitespace-nowrap tb:w-3/5 wb:w-3/5 text-cbTxtSec')]"))
				.getText();
	}

	public static String batRun(String batMan) {
		return driver.findElement(By.xpath("//a[text()='" + batMan
				+ "']/ancestor::div/following-sibling::div[contains(@class,'flex justify-center items-center font-bold text-sm tb:text-xs wb:text-xs')]"))
				.getText();
	}
	
	public static String nbaPlayerScore(String playerName) {
		return driver.findElement(By.xpath("(//a[text()='"+playerName+"']/ancestor::tr/td/following-sibling::td)[last()]")).getText();
		
	}

	public static void main(String[] args) throws InterruptedException {

		driver = new FirefoxDriver();
		
//		driver.get("https://datatables.net/extensions/fixedcolumns/examples/integration/select-checkbox.html");

//		driver.get(
//				"https://m.cricbuzz.com/live-cricket-scorecard/82441/ind-vs-aus-1st-t20i-australia-tour-of-india-2023");
		
		driver.get("https://sports.yahoo.com/nba/dallas-mavericks-boston-celtics-2024061702/");
		
		Thread.sleep(2000);
		
		

//		WebTableHandling.selectUserName("Donna");
//		
//		String value=WebTableHandling.selectUserDate("Donna");
//		
//		System.out.println(value);

//		String wicket = WebTableHandling.batmanWicketTaker("Tim David");
//
//		System.out.println(wicket);
//
//		String run = WebTableHandling.batRun("Tim David");
//
//		System.out.println(run);
		
		
		String basket = WebTableHandling.nbaPlayerScore("Jayson Tatum");

		System.out.println(basket);
		

	}
}
