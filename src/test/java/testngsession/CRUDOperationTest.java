package testngsession;

import org.testng.annotations.Test;

public class CRUDOperationTest {
	
	public void createUser() {
		System.out.println("create user");
	}
	
	public void getUser() {
		System.out.println("getuser");
	}
	
	public void updateUser() {
		System.out.println("updateuser");
	}
	
	public void deleteUser() {
		System.out.println("Delete user");
	}
	
	@Test
	public void createUserTest() {
		createUser();
	}
	
	@Test
	public void getUserTest() {
		createUser();
		getUser();
	}
	
	@Test
	public void updateUserTest() {
		createUser();
		getUser();
		updateUser();
		getUser();
	}
	
	@Test
	public void deleteUserTest() {
		createUser();
		getUser();
		deleteUser();
		getUser();
	}
	
	//when your are withinclass you can call non-static method without object
}
