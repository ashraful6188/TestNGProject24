package day15;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/*
 * 1) Open Application
 * 2) test logo presence
 * 3) login to the app
 * 4) logout
 */
public class OrangeHRMTesr {
	WebDriver driver;

	@Test(priority = 1)
	public void opnApp() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@Test(priority = 2)
	public void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("Logo is displayed: " + status);
	}
	@Test(priority =3)
	public void testLogin() {
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		System.out.println("submit is success");
		
		
		
	}
	@Test(priority=4)
	public void logOut() {
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		driver.findElement(By.xpath("//a[@href='/web/index.php/auth/logout']")).click();
		System.out.println("Log out successful");
	}
	
	
	
	
	

}
