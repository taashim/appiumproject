package testcase;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pageobject.Capability;
import pageobject.SignIn;

public class OpenApplication extends Capability {
SignIn obj;
	
	@Test
	public void openApp() throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		AndroidDriver<AndroidElement> driver = DesiredCapability();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		obj= new SignIn(driver);
		
		
	}
	
	@Test(dependsOnMethods = "openApp")
	public void signIn() throws InterruptedException {
		Thread.sleep(20000);
		obj.TC01();
	}

	
}
