package seleniumOpenBrowser;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.flipkart.com");

		List<WebElement> allLink = driver.findElements(By.tagName("a"));

//		allLink.stream().forEach(e ->System.out.println(e.getText()));

//		allLink.stream().filter(e ->!e.getText().isEmpty()).forEach(e->System.out.println(e.getText()));

//		allLink.stream().filter(e -> !e.getText().isEmpty()).filter(e -> e.getTagName().startsWith("Flipkart"))
//				.forEach(e -> System.out.println(e.getText()));
		
		List<WebElement> flipkartLink = allLink 
		        .stream()
		                 .filter(e->e.getText().isEmpty())
		                                                  .filter(e->e.getText().startsWith("Filpkart"))
		                                                                                              .collect(Collectors.toList());
		
		List<String> flipkartListText = flipkartLink.stream().map(e->e.getText()).collect(Collectors.toList());
		
		System.out.println(flipkartListText);
		System.out.println(flipkartListText.size());
		                		                           
		                                                 
		

	}

}
