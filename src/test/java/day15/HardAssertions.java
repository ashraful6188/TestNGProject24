package day15;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertions {

	@Test
	public void test() {

//		  Assert.assertEquals("xyz", "xyz");// pass
//        Assert.assertEquals(1234, 1234);// pass

//        Assert.assertEquals("abc", 789);// fail
//        Assert.assertEquals("789", 789);// fail

//		Assert.assertNotEquals("xyz", "xyz");// fail
//		Assert.assertNotEquals(123, 456);//pass

//		Assert.assertTrue(false);//fail
//		Assert.assertTrue(true);//pass
//		Assert.assertTrue(1==2);//fail
//		Assert.assertTrue(1==1);//pass

//		Assert.assertFalse(false);// pass
//		Assert.assertFalse(true);// fail
//		Assert.assertFalse(1 == 2);// pass
//		Assert.assertFalse(1 == 1);// fail

		Assert.fail();
//		if (true) {
//			System.out.println("Test pass");
//		} else {
//			Assert.fail();
//		}
//
  }

}
