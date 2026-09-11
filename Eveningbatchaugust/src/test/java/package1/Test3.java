package package1;

import org.testng.annotations.Test;

public class Test3 {
	
	@Test(groups="Regression")
	public void payment() {
		System.out.println("Payment has been done for the product");
	}
	
	@Test(groups="sanity")
	public void customersupport() {
		System.out.println("24/7 customer support features have been implemented");
		
	}
	
	@Test(groups="smoke")
	public void orderstatus() {
		System.out.println("Order status will be updated as per the history");
	}

}
