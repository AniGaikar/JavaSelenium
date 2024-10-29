package seleniumOpenBrowser;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new FirefoxDriver();
		
		driver.get("https://www.orangehrm.com/en/30-day-free-trial");
		
		driver.manage().window().maximize();
		
		By country = By.id("Form_getForm_Country");
		
//		Select select = new Select(driver.findElement(country));
//		
//		List<WebElement> countryList = select.getOptions();
//		
//		System.out.println(countryList.size()-1);
//		
//		
//		for(WebElement e: countryList) {
//		String text = e.getText();
//		System.out.println(text);
//		if(text.equals("Brazil")) {
//			e.click();
//			break;
//		}
//		}

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	
	public static List<WebElement> getDropDownOptionsList(By locator) {
		Select select = new Select(getElement(locator));
		return select.getOptions();
	}
	
	
	public static List<String> getDropDownOptionTextList(By locator) {
		List<WebElement> optionList = getDropDownOptionsList(locator);
		List<String> optionTextList = new ArrayList<String>();
		for(WebElement e:optionList ) {
			String text=e.getText();
			optionTextList.add(text);	
		}
		return optionTextList;
	}
	
	public static int getTotalDropDownOptions(By locator) {
		return getDropDownOptionsList(locator).size();
	}

}
