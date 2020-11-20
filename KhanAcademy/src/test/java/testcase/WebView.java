package testcase;

import org.testng.annotations.Test;

import pageobject.Capability;
import pageobject.ChromeSwitch;

public class WebView extends Capability{

	ChromeSwitch s;
	@Test
	public void TC03_call() throws InterruptedException
	
	{
		s= new ChromeSwitch(driver);
		s.selectlanguage();
		s.chromeCourse();
		
		
	}
	
	
	
}
