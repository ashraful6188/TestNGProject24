package day16;

import org.testng.annotations.Test;

 public class PaymentTest {
@Test(priority=1, groups= {"sanity", "regression", "functional"})
	public void payinDollars() {
		System.out.println("pay in Dollars");
	}

@Test(priority=2, groups= {"sanity", "regression", "functional"})
public void payEuro() {
	System.out.println("pay in Euro");
}

}
