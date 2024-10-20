package day16;

import org.testng.annotations.Test;

public class LoginTest {

	@Test(priority = 1, groups = { "sanity" })
	public void loginByEmail() {
		System.out.println("Login by Email");
	}

	@Test(priority = 2, groups = { "sanity" })
	public void loginByFacebook() {
		System.out.println("Login by Facebook");
	}

	@Test(priority = 3, groups = { "sanity" })
	public void loginByTwitter() {
		System.out.println("Login by Twitter");
	}

}
