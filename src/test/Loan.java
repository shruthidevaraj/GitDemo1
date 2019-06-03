package test;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Loan {
	@Test
	public void webCarloan() {
		//Selenium
		System.out.println("webCarloan");
	}
	@Test
	public void mobileLoginCarLoan() {
		//Appium
		System.out.println("mobileLoginCarLoan");
	}
	@Test
	public void LoginApiCarLoan() {
		//Rest API Implimentation
		System.out.println("LoginApiCarLoan");
	}
	@Test(dependsOnMethods = "webCarloan")
	public void mobileSigninCarLoan() {
		System.out.println("mobileSigninCarLoan");
	}
	@Test(groups= {"smoke"})
	public void mobileSignOutCarLoan() {
		System.out.println("mobileSignOUtCarLoan");
	}
	
	@BeforeSuite
	public void beforesuiteExample() {
	System.out.println("Before Suite example - Loan class- Executing at the begging of the suite");	
	}
	
	@BeforeTest
	public void preRequiste() {
		System.out.println("i will execute first - @BeforeTest ");
	}
}
