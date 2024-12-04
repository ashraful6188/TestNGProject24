package day16;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener {

	public void onStart(ITestContext context) {
		System.out.println("Test execution started......before all test execution");
	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test started .....before every test method");
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed .......");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Test failed !!!");
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println("Test got skipped!");
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test finished...!!!");
	}

}
