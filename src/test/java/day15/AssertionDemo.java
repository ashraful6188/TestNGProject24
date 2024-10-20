package day15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionDemo {
	@Test
	public void testTitle() {
		String actualTitle = "Selenium";
		String expectedTitle = "Selenium";
		
//		if (expectedTitle.equals(actualTitle)) {
//			System.out.println("Test Passed");
//		} else {
//			System.out.println("Test failed ");
//		}
		
//		if(expectedTitle.equals(actualTitle)) {
//			Assert.assertTrue(true);
//		}else {
//			Assert.assertTrue(false);
//		}
		
		Assert.assertEquals(actualTitle, expectedTitle);
		
	}

}
