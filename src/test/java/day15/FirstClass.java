package day15;

import org.testng.annotations.Test;

/*
 * 1) Open app
 * 2) Log In
 * 3) Log out
 */

public class FirstClass {
	
    @Test(priority=-1)
	public void opnApp() {
		System.out.println("Opnning the application");
	}
	@Test(priority=2)
	public void login() {
		System.out.println("Logging in........");
	}
	@Test(priority=3)
	public void logOut() {
		System.out.println("Logging out........");
	}

	
	
	
	
	
	
}
