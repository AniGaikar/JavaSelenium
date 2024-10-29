package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTest extends BaseTest{
	
	WebDriver driver;
	
//	@BeforeTest
//	public void setUp() {
//		driver = new FirefoxDriver();
//		driver.get("https://www.amazon.com");
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//	}
	
	@Test
	public void titlecheck() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
	}
	
	
	@Test
	public void searchBox() {
		boolean search=driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
		Assert.assertTrue(search);
	}
	
	@Test
	public void footerLink() {
	boolean islink = driver.findElement(By.linkText("Help")).isDisplayed();
	Assert.assertTrue(islink);
	}
//	@AfterTest
//	public void tearDown() {
//		driver.close();
//	}

}
