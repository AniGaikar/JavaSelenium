 package seleniumOpenBrowser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoggleSearch {
	
	public static WebElement getElement(By Locator) {
		return driver.findElement(Locator);
	}
	
	public static List<WebElement> getElements(By Locator){
		return driver.findElements(Locator);
	}
	
	public static void doSendKey(By Locator,String value) {
		getElement(Locator).sendKeys(value);
	}
	
	public static List<String> getText(By locator,String value) {
		List<WebElement> textDisplayed = getElements(locator);
		List<String> gotText= new ArrayList<String>();
		
		for(WebElement e:textDisplayed) {
			String text=e.getText();
			gotText.add(text);
			System.out.println(text);
		}
		int count =gotText.size();
		System.out.println("total number of lanuage are"+":"+count);
		return gotText;
	}
	
	public static List<String> getAttribut(By locator,String value) {
		List<WebElement> LinkDisplayed = getElements(locator);
		List<String> gotLink= new ArrayList<String>();
		
		for(WebElement e:LinkDisplayed) {
			String  link =e.getAttribute(value);
			String text=e.getText();
			gotLink.add(link);
			System.out.println(link+":"+text);
		}
		int count =gotLink.size();
		System.out.println("total number of link are"+":   "+count);
		return gotLink;
	}
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https:\\www.google.com");
		
		driver.manage().window().maximize();
		
//		By lanuage=By.xpath("//div[@id='SIvCob']/a");
//		
//		
//		GoggleSearch.getText(lanuage, "मराठी");
//		
//		
//		
//		By footer =By.xpath("//div[@class='KxwPGc SSwjIe']//a");
//		GoggleSearch.getAttribut(footer, "href");
		
		
		//type one piece in google search
		
		By enterText = By.name("q");
		
		GoggleSearch.doSendKey(enterText, "one piece");
		
		Thread.sleep(3000);
		
		// get list of search
		
		By fetchOption = By.xpath("//div[@class='eIPGRd']//div[@class='wM6W7d']//span");
		
		
		GoggleSearch.getText(fetchOption, null);
		

	}

}
