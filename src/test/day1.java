package test;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class day1 {
	@AfterTest
	public void lastexecution() {
		System.out.println("I will execute last");
	}
	@Test
	public void Demo(){
		System.out.println("hello");
		Assert.assertTrue(false);
	}
	@AfterSuite
	public void AfSuite() {
		System.out.println("I am the no.1 from last");
	}
	@Test
	public void SecondTest() {
		System.out.println("bye");
	}
}
