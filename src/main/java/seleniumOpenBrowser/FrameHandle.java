package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

//		System.setProperty("webdriver.chrome.driver",
//				"C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		
		Thread.sleep(3000);
		
//		driver.switchTo().frame(2);
		
//		driver.switchTo().frame("bot");
		
		driver.switchTo().frame("//frame[@src='top.html']");
		String text=driver.findElement(By.tagName("h2")).getText();
		
		System.out.println(text);
		
		driver.switchTo().defaultContent();//this is use to come out of ifarme to driver enviroment 


	}

}
