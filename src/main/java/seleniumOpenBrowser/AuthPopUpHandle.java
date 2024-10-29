package seleniumOpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopUpHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String username = "admin";
		String password = "admin";

		driver.get("https://" + username + ":" + password + "@" + "the-internet.herokuapp.com/basic_auth");

	}

}
