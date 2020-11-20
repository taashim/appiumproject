package testcase;

import org.testng.annotations.Test;

import pageobject.Capability;
import pageobject.CourseCode;

public class SelectCourse extends Capability {
	
	CourseCode c;
	
	@Test
	public void select_course() throws InterruptedException
	{
		
		c= new CourseCode(driver);
		c.Select_Course();
		
	}
	
}
