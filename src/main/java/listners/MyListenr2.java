package listners;


import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Listeners;

//This class implements IRetryAnalyzer from TestNG.
//It's used to **automatically retry failed tests** up to a maximum number of times.

public class MyListenr2 implements IRetryAnalyzer {

 // Maximum number of retry attempts allowed
 int maxTry = 3;

 // Counter to track how many times the test has been retried so far
 int count = 0;  // For example: 1st retry, 2nd retry, 3rd retry

 // This method is automatically called by TestNG when a test fails.
 // It returns true if the test should be retried, false if not.
 @Override
 public boolean retry(ITestResult result) {

     // If current retry count is less than max allowed, retry the test
     if (count < maxTry) {
         count++;            // Increment retry count
         return true;        // Retry the test
     }

     // If retry count reached maxTry, don't retry again
     return false;
 }
}

