package reporter;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Report1 {
	@Test
	public void add()
	{
		System.out.println("time pass");
		Reporter.log("test1");
	}
	@Test
	public void add1()
	{
		System.out.println("time fail");
		Reporter.log("test2");
	}
	@Test
	public void add3()
	{
		System.out.println("time fail");
		Reporter.log("test3");
	}
	@Test
	public void add4()
	{
		System.out.println("time fail");
		Reporter.log("test4");
	}

}
