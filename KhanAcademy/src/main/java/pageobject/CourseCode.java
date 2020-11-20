package pageobject;



import org.testng.Assert;
import org.testng.annotations.Test;
import org.openqa.selenium.By;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CourseCode  {

	AndroidDriver<AndroidElement> driver;
	public CourseCode(AndroidDriver<AndroidElement> driver) {
		this.driver =  driver;
	}
	
	public void Select_Course() throws InterruptedException
	{
		
		//first course
		/*driver.findElement(By.xpath("//*[@text='Get started']")).click();
		driver.findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Graduate studies\"));"));
			
			driver.findElement(By.xpath("//*[@text='Graduate studies']")).click();
			Thread.sleep(5000);
			
			//driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Computer programming\").instance(0))").click();
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Macroeconomics\").instance(0))").click();
			int count =driver.findElements(By.xpath("//*[@class='android.widget.TextView']")).size();
			System.out.println(count);
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@text='Done']")).click();
			*/
			
			//2nd course
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[@text='Edit']")).click();
			Thread.sleep(5000);
			driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Macroeconomics\").instance(0))").click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@text='Done']")).click();
			Thread.sleep(5000);
			String course=driver.findElement(By.xpath("//*[@text='Macroeconomics']")).getText();
			Assert.assertEquals(course,"Macroeconomics" );
	}
	
}
