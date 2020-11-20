package pageobject;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import static io.appium.java_client.touch.TapOptions.tapOptions;
import static io.appium.java_client.touch.offset.ElementOption.element;

public class ChromeSwitch  {
	
	AndroidDriver<AndroidElement> driver;
	public ChromeSwitch(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
	}
	
	
	public void selectlanguage() throws InterruptedException
	{
	Thread.sleep(5000);
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Select language\").instance(0))").click();
	Thread.sleep(3000);
	WebElement lang=driver.findElement(By.xpath("//*[@text='English']"));
	TouchAction t= new TouchAction(driver);
	t.tap(tapOptions().withElement(element(lang))).perform();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[@text='English']")).click();
	Thread.sleep(5000);
	driver.findElement(MobileBy.AccessibilityId("Navigate up")).click();
	Thread.sleep(5000);
	}
	
	
	public void chromeCourse() throws InterruptedException 
	{
	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Computer programming\").instance(0))").click();
	Thread.sleep(3000);
	driver.findElement(By.id("android:id/button_once")).click();
	Thread.sleep(40000);
	Set<String> contextNames = driver.getContextHandles();
	for (String contextName : contextNames) 
	{ System.out.println(contextName);
	}
	Thread.sleep(8000);
	driver.context("WEBVIEW_chrome");
	//driver.findElement(By.xpath("//*[@text='Start from the basics']")).click();
	
	driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[text()='Intro to programming']")).click();
	Thread.sleep(8000);
	driver.findElement(By.xpath("//span[text()='What is Programming?']")).click();
	//driveruid-dialog-0-close-button
	Thread.sleep(20000);
	//driver.findElement(By.xpath("//button[@class='_xrgghrk']")).click();
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(20000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	Thread.sleep(20000);
	driver.pressKey(new KeyEvent(AndroidKey.BACK));
	driver.context("NATIVE_APP");
	
	}
}


