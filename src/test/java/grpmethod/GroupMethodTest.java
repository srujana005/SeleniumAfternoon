package grpmethod;

import org.testng.annotations.Test;

public class GroupMethodTest {

	@Test(groups = "smoke")
	public void test1() {
		System.out.println("Smoke Test 1");
	}

	@Test(groups = "regression")
	public void test2() {
		System.out.println("Regression Test 2");
	}

	@Test(groups = { "sanity", "smoke" })
	public void test3() {
		System.out.println("Sanity + Smoke Test 3");
	}
}
