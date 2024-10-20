package day15;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationDemo2 {
	@BeforeClass
	public void launchApp() {
		System.out.println("Before Class- launch app");
	}

	@AfterClass
	public void closeBrowser() {
		System.out.println("After class - close browser");
	}

	@Test(priority = 1)
	public void loginWithEmail() {
		System.out.println("Login with Email");
	}

	@Test(priority = 2)
	public void logWithTwitter() {
		System.out.println("Login with twitter");
	}

	@Test(priority = 3)
	public void logWithPhoneNumber() {
		System.out.println("Log in with phone number");
	}

	@AfterMethod
	public void sendEmail() {
		System.out.println("Send Email");
	}

	@BeforeTest
	public void connectDB() {
		System.out.println("Before Test- connecting to DB");
	}

	@AfterTest
	public void disconnectingDB() {
		System.out.println("After test - disconnecting DB");
	}

	@BeforeSuite
	public void BS() {
		System.out.println("Before Suite");
	}

	@AfterSuite
	public void AS() {
		System.out.println("After suite");
	}

}
