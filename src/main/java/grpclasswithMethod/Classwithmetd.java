package grpclasswithMethod;


import org.testng.annotations.Test;

// Class-level group
@Test(groups = "smokeclass")  // <--- Class-level group
public class Classwithmetd {

    @Test
    public void testA() {
        System.out.println("Class-level group method A");
    }

    @Test(groups = "smoke")  // <--- Method-level group
    public void testB() {
        System.out.println("Method-level group method B");
    }

    @Test(groups = "regression")
    public void testC() {
        System.out.println("Different group method C");
    }
}
