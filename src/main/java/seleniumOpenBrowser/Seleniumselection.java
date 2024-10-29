package seleniumOpenBrowser;

import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. browser specific---can not used for the cross browser
//		ChromeDriver driver = new ChromeDriver();
		
		
		//2.wd = new cd - valid top casting--recommended--local execution 
		//WebDriver driver = new ChromeDriver();
		
		//3.sc= new cd()- vaild but not recommended
		//SearchContext Driver = new ChromeDriver();
		
		//4.RWD = new CD();-- Valid top Casting--recoomened
//		RemoteWebDriver Driver = new ChromeDriver();
		
//		5. WD = new rwd();-- vaild top casting--recommednd--Grid-use for remote execution
//		WebDriver driver = new RemoteWebDriver(remoteaddress,capabilities);
		
		//6. SC = new rwd();--valid but not recommended
		//SearchContext driver = new RemoteWebDriver(remoteaddress,capabilities);

	}

}
