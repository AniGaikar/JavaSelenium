package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginPageNegativeTestCase extends BaseTest {
	
	WebDriver driver;
	
//	@BeforeTest
//	public void setUp() {
//		driver = new FirefoxDriver();
//		driver.manage().window().maximize();
//		driver.manage().deleteAllCookies();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	}
	
	public  boolean loginPage(String email,String password) {
		driver.findElement(By.id("input-email")).clear();
		driver.findElement(By.id("input-email")).sendKeys(email);
		
		driver.findElement(By.id("input-password")).clear();
		driver.findElement(By.id("input-password")).sendKeys(password);
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		
		String alterText = driver.findElement(By.cssSelector(".alert.alert-danger.alert-dismissible")).getText();
		System.out.println(alterText);
		
		if(alterText.contains("No match for E-Mail Address and/or Password.")) {
			System.out.println("correct message is display");
			return true;
		}
		System.out.println("incorrect message is displayed");
		return false;
	}
	
	@DataProvider
	public Object dataProviderlist() {
		return new Object [][]{
			{"abccc@gmail.com", "testttt@123"},
			{"abccc1212@gmail.com", "testttt@123"},
			{"abcuuuu", "testttt@123"},
			{"teuust@gmail.com", " "},
			{"ttttiit@gmail.com", "testtttt"},
			{"#@#uiiui#@gmail.com", "asdasdasd"},
		};
	}
	
	@Test(dataProvider = "dataProviderlist")
	public void checkLoginPage(String email,String password) {
		boolean flage=loginPage(email, password);
		Assert.assertTrue(flage);
	}
	
//	@AfterTest
//	public void close() {
//		driver.close();
//	}

	

}
