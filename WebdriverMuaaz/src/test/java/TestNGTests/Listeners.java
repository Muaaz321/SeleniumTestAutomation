package TestNGTests;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{
	
	public void onTestStart(ITestResult results) {
		System.out.println("****** Test Started ***** " + results.getName());
	}
	
public void onTestSuccess(ITestResult results) {
	System.out.println("****** Test Success ***** " + results.getName());
	}

public void onTestFailure(ITestResult results) {
	System.out.println("****** Test Failure ***** " + results.getName());
}

public void onTestSkipped(ITestResult results) {
	System.out.println("****** Test Skipped ***** " + results.getName());
}
}
