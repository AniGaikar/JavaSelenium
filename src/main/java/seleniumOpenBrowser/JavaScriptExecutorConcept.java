package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class JavaScriptExecutorConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://app.hubspot.com/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//button[text()='Accept all']")).click();
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		
//		String title=js.executeScript("return document.title;").toString();
//		System.out.println(title);
//		
//		js.executeScript("alert('hi bro were are you;')");
		
		JavaScriptUtil jj = new JavaScriptUtil(driver);

//		String title=jj.getTitle();
//		System.out.println(title);
		
//		jj.alertPopUp("yo yo jjk one piece");
		
//		jj.confirmPopUp("im the on the one only one");
		
//		Thread.sleep(2000);
//		
//		jj.goRefreshPage();
//		
//		String text = jj.getPageInnerText();
//		System.out.println(text);
//		if(text.contains("Log in")) {
//			System.out.println("true");
//		}
//		else {
//			System.out.println("false");
			
//			WebElement form = driver.findElement(By.id("hs-login"));
//			jj.drawBorder(form);
//			
//			Thread.sleep(3000);
//			
			jj.scrollDown();
		}

	}


