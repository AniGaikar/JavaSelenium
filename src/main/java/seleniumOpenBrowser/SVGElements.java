package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://petdiseasealerts.org/forecast-map/#/");
		
//		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance-31344')]")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		Thread.sleep(8000);
		
		String mapXpath ="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='regions']//*[name()='path']";
		
		List<WebElement> map = driver.findElements(By.xpath(mapXpath));
		System.out.println(map.size());
		
		for(WebElement e: map) {
			String text=e.getAttribute("name");
			System.out.println(text);
			
		}
		

	}

}
