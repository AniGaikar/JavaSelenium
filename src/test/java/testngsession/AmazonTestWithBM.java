package testngsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AmazonTestWithBM extends BaseTest {
	
	WebDriver driver;
	
//	@BeforeMethod
//	public void setUp() {
//		driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.manage().deleteAllCookies();
//		driver.manage().window().maximize();
//		driver.get("https://www.amazon.com");
//	}
	
	// tcs should be independent
		//AAA Rule
		//AAA stands for: Arrange, Act, Assert
		//1 tc --> 1 assert
		@Test(priority = 1)
		public void titleTest() {
			String title = driver.getTitle();
			System.out.println("page title:" + title);
			Assert.assertEquals(title, "Amazon.com. Spend less. Smile more.");
		}

		@Test(priority = 2)
		public void searchExistTest() {
			boolean flag = driver.findElement(By.id("twotabsearchtextbox")).isDisplayed();
			Assert.assertTrue(flag);
		}

		@Test(priority = 3)
		public void isHelpExistTest() {
			boolean flag = driver.findElement(By.linkText("Help")).isDisplayed();
			Assert.assertTrue(flag);
		}
	
//	@AfterMethod
//	public void close()
//	{
//	driver.close();	
//	}

}
