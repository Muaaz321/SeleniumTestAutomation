package TestNGTests;

import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.Test;

public class RetryFailedTests {

	@Test
	public void Test() {
		System.out.println("I am inside Test Method");
	}


//	@Test(retryAnalyzer = TestNGTests.Retry.class)
//	public void Test1() {
//		System.out.println("I am inside Test1 Method");
//		Assert.assertTrue(false);
//	}
//
//
//	@Test(retryAnalyzer = TestNGTests.Retry.class)
//	public void Test2() {
//		System.out.println("I am inside Test2 Method");
//		Assert.assertTrue(false);
//	}

}
