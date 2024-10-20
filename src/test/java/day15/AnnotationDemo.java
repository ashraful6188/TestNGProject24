package day15;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
 * 1) Login - @BeforeMethod
 * 2) Search - @Test
 * 3) Logout - @AfterMethod
 * 4) advSearch-@Test
 */

public class AnnotationDemo {
	@BeforeMethod
	public void login() {
		System.out.println("Before Method- login");
	}
	@AfterMethod
	public void logOut() {
		System.out.println("After method - logout");
	}
	@Test(priority=1)
	public void search() {
		
		System.out.println("Search");
	}
	@Test(priority=2)
	public void advSearch() {
		System.out.println("Adv Search");
	}
	
	
	
	
	
	
	
	
	
	
	

}
