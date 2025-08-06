package aannotionexm;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class TestClass2 extends BaseConfig {

    @BeforeClass
    public void befClass() {
        System.out.println("####This is Before Class in TestClass2####");
    }

    @BeforeMethod
    public void befMethod() {
        System.out.println("Before Method --> Take Screenshot for method");
    }

    @Test
    public void test2() {
        System.out.println("This is Test 2 from TestClass2");
    }

    @Test
    public void test3() {
        System.out.println("This is Test 3 from TestClass2");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("###After Class in TestClass2###");
    }
}
