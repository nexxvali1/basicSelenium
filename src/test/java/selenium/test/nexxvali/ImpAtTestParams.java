package selenium.test.nexxvali;

import org.testng.Assert;
import org.testng.annotations.*;

public class ImpAtTestParams {
	
	@Test
	public void test1(){
		System.out.println("This is Test1");
		Assert.assertTrue(true);
	}
	
	@Test(dependsOnMethods = {"test1"}, alwaysRun = true)
	public void test2(){
		System.out.println("This is Test2");
	}
	
	@Test
	public void test3(){
		System.out.println("This is Test3");
	}
	
	@Test(enabled=false)
	public void test4(){
		System.out.println("This is Test4");
	}
	
	@Test(invocationCount=500)
	public void test5(){
		System.out.println("This is Test5");
	}

}
