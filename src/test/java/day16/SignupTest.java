package day16;

import org.testng.annotations.Test;

public class SignupTest {

	@Test(priority = 1, groups = { "regression" })
	public void signupbyemail() {

		System.out.println("Signup by email");
	}

	@Test(priority = 2, groups = { "regression" })
	public void signupbyfacebook() {

		System.out.println("Signup by facebook");
	}

	@Test(priority = 3, groups = { "regression" })
	public void signupbytwitter() {

		System.out.println("Signup by twitter");
	}

}
