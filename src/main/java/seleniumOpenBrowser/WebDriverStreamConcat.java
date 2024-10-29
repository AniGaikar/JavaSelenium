package seleniumOpenBrowser;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebDriverStreamConcat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://classic.crmpro.com");
		
		List<WebElement> header = driver.findElements(By.cssSelector("section#details p"));
		
		String para = header.stream().map(e->e.getText()).collect(Collectors.joining("||"));// this us to concat the thing
		
//		header.stream().forEach(e->System.out.println(e.getText()));

	}

}
