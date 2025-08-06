package teng;
import org.testng.annotations.Test;

public class InvcaCount {
	
	
	@Test(invocationCount=5)
	public void test1()
	{
		System.out.println("this is test 1 in Class 1");
	}
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("this is test 2 in Class 1");
	}


}
