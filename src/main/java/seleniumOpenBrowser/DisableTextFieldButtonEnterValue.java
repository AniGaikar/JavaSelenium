package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DisableTextFieldButtonEnterValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");

		WebElement pwd = driver.findElement(By.id("pass"));//this is disabled
		Thread.sleep(3000);
		pwd.sendKeys("test@123");
		//ElementNotInteractableException: element not interactable
		
		
		
//		WebDriver driver = new FirefoxDriver();
//		driver.get("https://classic.freecrm.com/register/");
//		
//		Thread.sleep(5000);
//		
//		WebElement submit_btn = driver.findElement(By.id("submitButton"));
//		
//		String disableText = submit_btn.getAttribute("disabled");
//		System.out.println(disableText);
//		
//		submit_btn.click();//ElementClickInterceptedException

	}

}
