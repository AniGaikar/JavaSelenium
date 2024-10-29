package seleniumOpenBrowser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserWindowHandleConcept {



	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		// in this program we are going to see that when a link is click in tab it open
		// in tab how to handle the driver as it need to switch to new tab
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@href,'linkedin')]")).click();
		
		
		//before switch to new window we need to have windows id to get we need you driver.getWindowHandle
		//for driver.get is Set its act as an unorganize list
		Set<String>handles=driver.getWindowHandles();
		
		
//		"Iterator is a non-primitive type used for iterating over collections in Java."
//
//		This statement highlights the following points:
//
//		Non-primitive type: Iterators in Java are objects (non-primitive types) that are used to iterate over elements in collections such as ArrayList, HashSet, LinkedList, etc.
//
//		Used for iterating over collections: Iterators provide a way to sequentially access elements within a collection without exposing the underlying structure of the collection (whether it's an array or another type of collection).
		
		Iterator<String> it = handles.iterator();
		
		String parentWindowId = it.next();
		System.out.println("parent window id : " + parentWindowId);
		
		
		String childWindowId = it.next();
		System.out.println("child window id : " + childWindowId); 
		
		
		driver.switchTo().window(childWindowId);
		
		driver.close();
		 
		

	}

}
