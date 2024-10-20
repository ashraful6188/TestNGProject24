package day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest {
	WebDriver driver;

	@BeforeClass
	@Parameters({ "url", "browser" })
	public void setup(String url, String browser) throws InterruptedException {
		
		switch (browser.toLowerCase()) {
		case "chrome":driver = new ChromeDriver();break;
		case "edge":driver = new EdgeDriver();break;
		case "firfox":driver = new FirefoxDriver();break;
		default:System.out.println("Invalid browser");return;
		}
		// maximize the window
		driver.manage().window().maximize();
		// add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		// launching web page
		driver.get(url);
		System.out.println(" Lunched url");
		Thread.sleep(3000);
	}

	@Test(priority = 1)
	public void testLogo() {
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();

		System.out.println("Logo is displayed: " + status);
		Assert.assertTrue(status);
	}

	@Test(priority = 2)
	public void testTitle() {
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
	}

	@Test(priority = 3)
	public void testURL() {
		Assert.assertEquals(driver.getCurrentUrl(),
				"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}

}
