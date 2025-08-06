package aannotionexm;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestClass1 extends BaseConfig {

    @BeforeClass
    public void befClass() {
        System.out.println("####This is Before Class in TestClass1####");
    }

    @BeforeMethod
    public void befMethod() {
        System.out.println("Before Method --> Take Screenshot for method");
    }

    @Test
    public void test1() {
        System.out.println("This is Test 1 from TestClass1");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("###After Class in TestClass1###");
    }
}
