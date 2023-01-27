package test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day4 {
	@Parameters({"URL"})
	@Test
	public void webLoginHomeLoan(String uname)
	{
		//selenium
		System.out.println("webloginhome Personal Loan");
		System.out.println(uname);
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginHomeLoan()
	{
		//appium
		System.out.println("mobileloginhome");
	}
	@Test
	public void LoginApiHomeLoan()
	{
		//Rest Api automation
		System.out.println("APIloginhome");
	}

}
