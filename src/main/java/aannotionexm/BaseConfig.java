package aannotionexm;


import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class BaseConfig {

    @BeforeSuite
    public void befSuite() {
        System.out.println("^^^^^^^^^^^^^^^^^this is Before Suite^^^^^^^^^^^^^^^^^^");
    }

    @BeforeTest
    public void befTest() {
        System.out.println("Before Test --> Open Chrome Browser");
    }

    @AfterTest
    public void afTest() {
        System.out.println("After Test --> Close the browser");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("^^^^^^^^^^^^After Suite ^^^^^^^^^^^^^^^^^");
    }
}
