package seleniumOpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserUtil {

	private WebDriver driver;
	// Initial value of driver is null because it an interface as it non-permitive
	// data type;

	// whenever we create a utilit method we need to create document

	/**
	 * this method is is used to initialize the driver on the basis of given browser
	 * 
	 * @param browser
	 * @return this returns the specific browser driver
	 */
	public WebDriver initDriver(String browser) {
		switch (browser.toLowerCase().trim()) {
		case "chrome": {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
			driver = new ChromeDriver();
			break;

		}
		case "firefox": {
//			System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
			driver = new FirefoxDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().fullscreen();
			break;
		}
		case "edge": {
			System.setProperty("webdriver.ie.driver",
					"C:\\Program Files\\Internet Explorer\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		}

		default:
			System.out.println("enter browser not found");
			break;
		}
		
//		driver.manage().deleteAllCookies();
//		driver.manage().window().fullscreen();

		return driver;
	}

	public void lunchURL(String url) {
		if (url == null) {
			System.out.println("url cannot be null");
		}

		if (url.indexOf("https") == 0) {
			driver.get(url);
		}
	}

	public String getPagetitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
	}

	public void CloseBrowser() {
		if (driver != null) {
			driver.quit();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
