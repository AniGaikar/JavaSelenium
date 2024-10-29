package testngsession;

import org.testng.annotations.Test;

public class PriorityTest {
	
	@Test(priority = 2)
	public void A() {
		System.out.println("A print");
	}
	
	@Test(priority = 1)
	public void B() {
		System.out.println("B print");
	}
	
	@Test(priority = -1)
	public void C() {
		System.out.println("C print");
	}
	
	@Test(priority = -2)
	public void D() {
		System.out.println("D print");
	}
	
	@Test(priority = 2)
	public void E() {
		System.out.println("E print");
	}
	
	//if there are no priority @test will excute the file according to alphabet order
	//but if there are some case with priority and some doesnt have it, it will excute the with alphabeta order
	//if the priority value are same it go by alphabeta order
	//





}
