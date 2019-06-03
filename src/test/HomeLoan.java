package test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HomeLoan {

	@Test
	public void webHomeloan() {
		//Selenium
		System.out.println("webHomeloan");
	}
	@Test
	public void mobileLoginHomeLoan() {
		//Appium
		System.out.println("mobileLoginHomeLoan");
	}
	@Test
	public void LoginApiHomeLoan() {
		//Rest API Implimentation
		System.out.println("LoginApiHomeLoan");
	}
	@BeforeTest
	public void preRequiste()
	{
		System.out.println("i'm going to execute first -preRequiste - HomeLoan");
	}
}
