package grp;

import org.testng.annotations.Test;

@Test(groups = "regression") // Entire class belongs to regression
public class GrpatClasslevel{

    @Test(groups = "ss")
    public void testA() {
        System.out.println("Test A in Regression Group");
    }

    @Test(groups ="tt")
    public void testB() {
        System.out.println("Test B in Regression Group");
    }
}

