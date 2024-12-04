package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderWithParallelTest {

	@Test(dataProvider = "loginData")
	public void loginTest(String user, String pass) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/login");

		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(user);
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pass);
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		boolean longinStatus;
		try {
			longinStatus = driver.findElement(By.xpath("//a[normalize-space()='Log out']")).isDisplayed();
			Assert.assertTrue(longinStatus);
		} catch (Exception e) {
			longinStatus = false;
			Assert.assertTrue(longinStatus);
		} finally {
			driver.quit();
		}

	}

	@DataProvider(parallel = true)
	public String[][] loginData() {

		String[][] data = {
				
				{ "john.doe1234@example.com", "test123" },
				{ "jane.smith321@example.com", "test321" },
				{ "laura.tylor1234@example.com", "test123" },
				{ "john.doe1234@example.com", "test123" },
				{ "jane.smith321@example.com", "test321" },
				{ "laura.tylor1234@example.com", "test123" },
				
		};

		return data;
	}

}
