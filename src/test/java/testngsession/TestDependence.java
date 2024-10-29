package testngsession;

import org.testng.annotations.Test;

public class TestDependence {

	@Test
	public void searchTest() {
		System.out.println("searchTest");
		int i =9/0;
	}
	
	@Test(dependsOnMethods = "searchTest")
	public void addToCart() {
		System.out.println("addToCart");
	}
	
	@Test(dependsOnMethods = "searchTest")
	public void makePayment() {
		System.out.println("MakePayment");
	}

}
