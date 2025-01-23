package tests.classwork.day22;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;


//R2361
public class MyTestListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult tr) {
        Result result = new Result(5);
        TestRailReporter.reportResult("2361", tr.getMethod().getDescription(), result);
    }
    @Override
    public void onTestSuccess(ITestResult tr) {
        Result result = new Result(1);
        TestRailReporter.reportResult("2361", tr.getMethod().getDescription(), result);
    }
}
