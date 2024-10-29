package seleniumOpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SeleniumOpenChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver= null;

		String browser ="firefox";
		
		switch (browser.toLowerCase().trim()) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
//			System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.setProperty("webdriver.ie.driver", "C:\\Program Files\\Internet Explorer\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("No such browser found: " + browser);
			break;
	}
		
		driver.get("https://sugarcosmetics.com");
		
		driver.manage().window().maximize();
		
		
		String url = driver.getTitle();
		
		System.out.println(url);
		
		if(url.equals("Buy Beauty Products at SUGAR Cosmetics Online Store")) {
			System.out.println(url+" "+"pass");
		}
		else {
			System.out.println(url+" "+"fail");
		}
		driver.quit();
		
	}

}
