package testngsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RegisterPage {
	
	WebDriver driver;

	@BeforeTest
	public void setUP() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.manage().deleteAllCookies();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	}
	
	public boolean action(String firstName,String lastName,String email,String tele,String password) {
		driver.findElement(By.id("input-firstname")).clear();
		driver.findElement(By.id("input-firstname")).sendKeys(firstName);
		
		driver.findElement(By.id("input-lastname")).clear();
		driver.findElement(By.id("input-lastname")).sendKeys(lastName);
		
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		driver.findElement(By.id("input-telephone")).clear();
		driver.findElement(By.id("input-telephone")).sendKeys(tele);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		String text=driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(text);
		
		if(text.contains("You must agree to the Privacy Policy!")) {
			return true;
		}
		return false;
	}
	
	@DataProvider
	public Object dataGiving(){
		return new Object[][] {
			
			{"NJ", "gai", "gai@gmail.com", "999933333", "ttttttt"},
			{"TJ", "gai", "gai@gmail.com", "999933333", "ttttttttt"},
			{"MJ", "gai", "gai@gmail.com", "999933333", "ttttttttt"}
		};
	}
	
	@Test(dataProvider = "dataGiving")
	public void checkpage(String firstName,String lastName,String email,String tele,String password) {
		boolean check = action(firstName,lastName,email,tele,password);
		Assert.assertTrue(check);
	}
	
	@AfterTest
	public void close() {
		driver.close();
	}
}
