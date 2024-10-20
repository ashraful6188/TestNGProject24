package day16;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtenReportManager implements ITestListener {

	public ExtentSparkReporter sparkReporter; // UI of the report
	public ExtentReports extent;// add common information
	public ExtentTest test;// create test case entries in the report and update the status
	// of the test methods

	public void onStart(ITestContext context) {
		
		// specify the location of the report being generated with file name and
		// extension
		sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir") + "/reports/myReport.html");
		// set title of the report
		sparkReporter.config().setDocumentTitle("Automation Report");
		// set name of the report
		sparkReporter.config().setReportName("Funtional Testing");
		// set theme of the display
		sparkReporter.config().setTheme(Theme.STANDARD);
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		// add common informations
		extent.setSystemInfo("Computer Name", "localhost");
		extent.setSystemInfo("Enviroment", "QA");
		extent.setSystemInfo("Tester Name", "ProSmart");
		extent.setSystemInfo("OS", "Windows 10");
		extent.setSystemInfo("Browser Name", "chrome");

	}

	public void onTestSuccess(ITestResult result) {
		// Create a new entry in the report
		test = extent.createTest(result.getName());
		// log the result
		test.log(Status.PASS, "Passed test is " + result.getName());

	}

	public void onTestFailure(ITestResult result) {
		// Create a new entry in the report
		test = extent.createTest(result.getName());
		// log the result
		test.log(Status.FAIL, "Failed test is " + result.getName());
		// capture throwable in the log
		test.log(Status.FAIL, result.getThrowable());
	}

	public void onTestSkipped(ITestResult result) {
		// Create a new entry in the report
		test = extent.createTest(result.getName());
		// log the result
		test.log(Status.SKIP, "Skipped test is " + result.getName());
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
