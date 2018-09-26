package generic;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Result implements ITestListener {
	public static int passCount=0,failCount=0;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		passCount++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		failCount++;
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		Utility.writeResultToXL("./result/Summary.xlsx", "sheet1", passCount, failCount);
		// TODO Auto-generated method stub
		
	}

}
