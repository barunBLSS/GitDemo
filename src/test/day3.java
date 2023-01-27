package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day3 {
	@BeforeClass
	public void befclass() {
		System.out.println("before executing any methods in the class");
	}
	@Parameters({"URL","APIKey/username"})
	@Test
	public void webLoginCarLoan(String urlname,String key)
	{
		//selenium
		System.out.println("weblogincar");
		System.out.println(urlname);
		System.out.println(key);
	}
	@BeforeMethod
	public void beforeevery() {
		System.out.println("I will execute before every test method in day3 class");
	}
	@AfterMethod
	public void afterevery() {
		System.out.println("I will execute after every test method in day3 class");
	}
	@AfterClass
	public void aftclass() {
		System.out.println("after executing any methods in the class");
	}
	@Test(groups= {"Smoke"})
	public void MobileLoginCarLoan()
	{
		//appium
		System.out.println("mobilelogincar");
	}
	@BeforeSuite
	public void BfSuite() {
		System.out.println("I am no.1");
	}
	@Test(enabled=false)
	public void MobilSignInCarLoan()
	{
		//appium
		System.out.println("mobile Sign In");
	}
	@Test(dataProvider="getData")
	public void MobileSignOutCarLoan(String username, String password)
	{
		//appium
		System.out.println("mobile SignOut");
		System.out.println(username);
		System.out.println(password);
	}
	@Test(dependsOnMethods={"webLoginCarLoan","MobileSignOutCarLoan"})
	public void APICarLoan()
	{
		//Rest Api automation
		System.out.println("APIlogincar");
	}
	@DataProvider
	public Object[][] getData() {
		//1st combination-username password-good credit history
		//2nd-un pwd -no credit history
		//3rd-un pwd -fraudlent credit
		Object[][] data=new Object[3][2];
		//1st set data
		data[0][0]="firstsetusername";
		data[0][1]="firstpassword";
		//columns in the row are nothing but values for that particular combination
		//2nd data set
		data[1][0]="secondsetusername";
		data[1][1]="secondpassword";
		//3rd data set
		data[2][0]="thirdsetusername";
		data[2][1]="thirdpassword";
		return data;
		
		
		
	}

}
