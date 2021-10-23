package TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerTest implements ITestListener{
    @Override
    public void onStart (ITestContext result) {
    	System.out.println("-----START-----" + "\r");
    }
    @Override
    public void onTestSuccess (ITestResult result) {
    	System.out.println("TESTCASE PASS: " + result.getName());
    }
    @Override
    public void onFinish (ITestContext result) {
    	System.out.println("-----END-----" + "\r");
    }
    @Override
    public void onTestFailure (ITestResult result) {
    	System.out.println("TESTCASE FAIL: " + result.getName());
    }
    @Override
    public void onTestSkipped (ITestResult result) {
    	System.out.println("TESTCASE SKIP: " + result.getName());
    }
    @Override
    public void onTestFailedButWithinSuccessPercentage (ITestResult result) {

    }
}