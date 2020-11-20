package pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class SignOut {

	AndroidDriver<AndroidElement> driver;
	public SignOut(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
	}
	
	public void signout() throws InterruptedException {
	WebElement settingsBtn = driver.findElement(MobileBy.AccessibilityId("Settings"));
	settingsBtn.click();
	Thread.sleep(3000);

	WebElement signoutLink = driver.findElement(By.xpath("//*[@text='Sign out']"));
	signoutLink.click();
	}
}
