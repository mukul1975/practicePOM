package Resources;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class listener extends BrowserInicialized implements ITestListener{
	
	ExtentReports Report=ReportFile.report();
	ExtentTest test;

	public void onTestStart(ITestResult result) {
		
		test=Report.createTest(result.getMethod().getMethodName());
		
	}

	public void onTestSuccess(ITestResult result) {
		
		screenShot(result.getMethod().getMethodName());
		test.log(Status.PASS, "TestCase passed");
		
	}

	public void onTestFailure(ITestResult result) {
		screenShot(result.getMethod().getMethodName());
		test.fail(result.getThrowable());
		test.log(Status.FAIL, "TestCase Failed");
	}

	public void onTestSkipped(ITestResult result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		
	}

	public void onFinish(ITestContext context) {
		
		Report.flush();
		
	}
	
	

}
