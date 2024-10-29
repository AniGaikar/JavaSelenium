package seleniumOpenBrowser;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ElementUtil {
	
	private WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public  WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public  List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
	}
	public boolean getdisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	
	public void writText(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void clickButton(By locator) {
		getElement(locator).click();
	}
	
	public void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public void getElementAtrribut(By locator,String value) {
		List <WebElement> eleList = getElements(locator);
		for(WebElement e: eleList) {
			String attval = e.getAttribute(value);
			System.out.println(attval);
		}
	}
	
	public List<String> getElementTextList(By locator){
		List<String>eleTextList = new ArrayList<String>();
		List<WebElement> eleList = getElements(locator);
		for(WebElement e: eleList) {
			String text = e.getText();
			eleTextList.add(text);
		}
		return eleTextList;
	}
	
	public void doSelectDropDownByIndex(By locator, int index) {
		Select select = new Select(getElement(locator));
		select.selectByIndex(index);
	}
	
	public void doSelectDropDownByValue(By locator, String value ) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}
	
	public void doSelectDropDownByVisibleText(By locator, String value ) {
		Select select = new Select(getElement(locator));
		select.selectByValue(value);
	}

}
