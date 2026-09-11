package package1;

import org.testng.annotations.Test;

public class Test2 {
	
	@Test(groups="smoke")
	public void loginTest() {
		System.out.println("App logged in ");
	}
	
	@Test(groups="sanity")
	public void logoutTest() {
		System.out.println("App logged out");
	}
	
	@Test(groups="smoke")
	public void search() {
		System.out.println("product search is working as expected");
	}
}
