package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetTextForTextField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("input[id='input-firstname']")).sendKeys("nj");
		
		String text= driver.findElement(By.cssSelector("input[id='input-firstname']")).getAttribute("value");
		
		System.out.println(text);
		
		driver.findElement(By.cssSelector("input[id='input-lastname']")).sendKeys(null);
		
		String texted = driver.findElement(By.cssSelector("input[id='input-lastname']")).getAttribute("value");
		
		System.out.println(texted);
		
		// when user try to pass null it will get an expection of IllegalArgumentException:

	}

}
