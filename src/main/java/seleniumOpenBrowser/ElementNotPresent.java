package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementNotPresent {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By logoImage = By.className("img-responsive");
		By  search = By.name("search");
		
		//we+action
		boolean flageImg = driver.findElement(logoImage).isDisplayed();
		System.out.println(flageImg);
		//FE- throw NoSuchEleementException
		// expection will only come will creating element, no when performing

	}

}
