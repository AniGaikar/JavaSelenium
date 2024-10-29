package seleniumOpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class WebDriverMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();	
		
		driver.get("https://qa.sugarcosmetics.com/");
		
		driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		if(url.equals("https://dev.sugarcosmetics.com/")) {
			System.out.println("pass");
		}
		
		else {
			System.out.println("fail");
		}
		
		if (url.contains("qa.")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}

	}

}
