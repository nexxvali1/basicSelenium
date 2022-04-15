package selenium.test.nexxvali;

import org.testng.ITestListener;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener {

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
	
	}

	public void onTestStart(ITestResult result) {
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("The rest is successful");
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("This test has failed");
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

}
