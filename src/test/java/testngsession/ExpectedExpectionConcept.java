package testngsession;

import org.testng.annotations.Test;

public class ExpectedExpectionConcept {
	
	@Test(expectedExceptions = Exception.class)
	public void loginTest() {
		System.out.println("login");
		int i =1/0;
	}
	


}