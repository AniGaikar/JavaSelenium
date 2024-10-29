package seleniumOpenBrowser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pagination {
	
	static WebDriver driver;
	
	public static void scrollDown() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	
	public static void scrollIntoView(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public static void selectcountry(String country) {
		List<WebElement>checkBoxount=driver.findElements(By.xpath("//td[text()='" + country + "']/preceding-sibling::td/input[@type='checkbox']"));
//		int count = checkBoxount.size();
		
//		System.out.println(count);
		
		for(WebElement e: checkBoxount) {
			e.click();
			
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		Thread.sleep(3000);
//		
//		scrollDown();
//		
//		Thread.sleep(3000);
//		
//		WebElement scroll = driver.findElement(By.xpath("//h2[@id='tablepress-1-name']"));
//		
//		scrollIntoView(scroll);
//		
//		selectcountry("India");
		
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
				selectcountry("India");
			}
				WebElement next = driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("no more click aviable");
					break;
				}
				next.click();
				Thread.sleep(1000);
			}
		}
		
	}


