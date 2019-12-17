package listeners;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGlisteners implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("test is started "+result.getName());

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("test is successful "+result.getName());		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("test is failded "+result.getName());	
		Assert.assertTrue(false);
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped "+result.getName());		
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
		// TODO Auto-generated method stub
		
	}

	
}
