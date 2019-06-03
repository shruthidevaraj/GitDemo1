package test;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Basics {

	
@Test
public void demo() {
	System.out.println("Hello demo");
}

@Test(groups= {"smoke"})
public void seondTestCase() {
	System.out.println("Bye demo ");
}

@AfterTest
public void afterTestEx() {
	System.out.println("I'm executing at the last - @AfterTest - Basics - PersonalLoan ");
}

@BeforeClass
public void beforeClassexample() {
	System.out.println("@before class example -Basics ");
}
}
