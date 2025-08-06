package grp;

import org.testng.annotations.Test;

@Test(groups = "smoke")  // Entire class belongs to "smoke"
public class GrapClasslevel2 {

    @Test
    public void testA() {
        System.out.println("Smoke Test A");
    }

    @Test
    public void testB() {
        System.out.println("Smoke Test B");
    }
}

