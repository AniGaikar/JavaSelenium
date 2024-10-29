package seleniumOpenBrowser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MoveToElementConcept {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.espn.in/nba/");
		
		WebElement teams=driver.findElement(By.xpath("(//nav[@id='global-nav-secondary']//span[contains(text(),'Teams')])[1]"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(teams).build().perform();
		
		Thread.sleep(3000);
		
		act.click(driver.findElement(By.xpath("//a[@data-teamid='14'][1]")));
		;

	}

}
