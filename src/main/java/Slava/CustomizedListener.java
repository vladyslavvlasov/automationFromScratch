package Slava;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.log4testng.Logger;

/**
 * Created by Murcielago on 16.12.2018.
 */
public class CustomizedListener implements ITestListener {
    Logger LOGGER = Logger.getLogger(CustomizedListener.class);

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {
        LOGGER.info("PASSED TEST CASES");
        iTestContext.getPassedTests().getAllResults()
                .forEach(result -> {LOGGER.info(result.getName());});

        LOGGER.info("FAILED TEST CASES");
        iTestContext.getFailedTests().getAllResults()
                .forEach(result -> {LOGGER.info(result.getName());});

        LOGGER.info(
                "Test completed on: " + iTestContext.getEndDate().toString());
    }
}
