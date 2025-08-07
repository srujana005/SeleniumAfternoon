package grpmethod;



import org.testng.annotations.Test;

public class Grouomethod2 {

    @Test(groups = "smoke")
    public void checkoutWithSingleItem() {
        System.out.println("Checkout with single item - SMOKE");
    }

    @Test(groups = "regression")
    public void checkoutWithoutPaymentMethod() {
        System.out.println("Checkout without payment - REGRESSION");
    }
}

