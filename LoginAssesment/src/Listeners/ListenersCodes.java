package Listeners;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ListenersCodes extends TestListenerAdapter {
   public void onTestStart(ITestResult tr){
        System.out.println("Test started");
    }

    public void onTestSuccess(ITestResult tr){
        System.out.println("Test success");
    }

    public void onTestFailure(ITestResult tr){
        System.out.println("Test failed");
    }

    //success,skipped,failure
}
