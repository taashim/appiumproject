package testcase;

import org.testng.annotations.Test;

import pageobject.Capability;
import pageobject.SignOut;

public class SignOutcall extends Capability{
	
	SignOut ob;
	@Test
	public void signoutapp() throws InterruptedException
	
	{
		ob= new SignOut(driver);
		ob.signout();
	}
}
