package day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardVsSoftAssertion {
	
//	@Test
//	public void test_hardassertions() {
//
//		System.out.println("Testing hard assertion - 1");
//		System.out.println("Testing hard assertion - 2");

//		Assert.assertEquals(12, 13);// hard assertion

//		System.out.println("Testing hard assertion - 3");
//		System.out.println("Testing hard assertion - 4");
//
//		Assert.assertEquals("abc", "xyz");// hard assertion
//
//		System.out.println("Testing hard assertion - 5");
//		System.out.println("Testing hard assertion - 6");
//	}
	
@Test
	public void test_softassertions() {

		System.out.println("Testing soft assertion - 1");
		System.out.println("Testing soft assertion - 2");
		
		// create an object of SoftAssert class
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(12, 12);// soft assertion

		System.out.println("Testing soft assertion - 3");
		System.out.println("Testing soft assertion - 4");

		softAssert.assertEquals("abc", "xyz");// soft assertion

		System.out.println("Testing soft assertion - 5");
		System.out.println("Testing soft assertion - 6");
		
		softAssert.assertAll();
	}

}
