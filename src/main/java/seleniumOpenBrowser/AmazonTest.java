package seleniumOpenBrowser;

public class AmazonTest  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.initDriver("firefox");
		
		
		brUtil.lunchURL("https://qa.sugarcosmetics.com/");
		
		String title =brUtil.getPagetitle();
//		System.out.println(title);
		if(title.contains("sugarcosmetics")) {
			System.out.println("title is pass");
		}
		else {
			System.err.println("title is fail");
		}
		
		String url =brUtil.getPageURL();
		if(url.indexOf("https")==0) {
			System.out.println("your url is correct");
		}
		else {
			System.out.println("your url is incorrect");
		}
		
		brUtil.CloseBrowser();

	}

}
