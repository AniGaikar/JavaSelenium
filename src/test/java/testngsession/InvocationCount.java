package testngsession;

import org.testng.annotations.Test;

public class InvocationCount {
	
	// It is use to check mutiple testcase
	//or can act like a load to hit same thing again and again
	
	@Test(invocationCount = 10)
	public void createUserTest() {
		System.out.println("Create user");
	}

}
