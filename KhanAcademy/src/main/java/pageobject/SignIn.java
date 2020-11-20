package pageobject;



import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;


public class SignIn {
	
	AndroidDriver<AndroidElement> driver;
	public SignIn(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
	}
	
	
	public void TC01() throws InterruptedException
	{
	driver.findElement(By.xpath("//*[@text='Dismiss']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"Dismiss\"]/android.widget.TextView")).click();
	
	driver.findElement(By.xpath("//*[@text='Sign in']")).click();
	driver.findElement(By.xpath("//*[@text='Continue with Google']")).click();
	Thread.sleep(10000);
	driver.findElement(By.id("com.google.android.gms:id/account_display_name")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//android.widget.ImageView[@content-desc=\"Settings\"]")).click();
	Thread.sleep(3000);
	String name =driver.findElements(By.xpath("//*[@class='android.widget.TextView']")).get(1).getText();
	System.out.println(name);
	
	if(name.equalsIgnoreCase("gini.joy30"))
	{
		driver.findElement(By.xpath("//*[@class='android.widget.ImageView']")).click();
	}
	
}
	
}


