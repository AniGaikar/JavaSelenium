package seleniumOpenBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class QuitVsChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://qa.sugarcosmetics.com/");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		driver.quit();
		//sid null
		
		driver.close();
		//mosuchsessionexpection:invalid session id
		//sid =123 --in valid

	}

}
