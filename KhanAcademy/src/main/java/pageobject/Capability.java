package pageobject;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class Capability {
	
	protected static AndroidDriver<AndroidElement> driver;
	protected static String appPackage;
	protected static String appActivity;
	protected static String ChromedriverExecutable;
	protected static String deviceName;
	
public static AndroidDriver<AndroidElement> DesiredCapability() throws IOException
{
	
	FileReader fr= new FileReader(System.getProperty("user.dir")+"//src//main//java//global.properties");
	Properties prop= new Properties();
	prop.load(fr);
	appPackage =prop.getProperty("AppPackage");
	appActivity=prop.getProperty("AppActivity");
	deviceName=prop.getProperty("DeviceName");
	ChromedriverExecutable= prop.getProperty("ChromedriverExecutable");
	
DesiredCapabilities cap = new DesiredCapabilities();
cap.setCapability(MobileCapabilityType.DEVICE_NAME, deviceName);
cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
//cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
cap.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,ChromedriverExecutable);
cap.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, appPackage);
cap.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, appActivity);
 driver = new AndroidDriver<AndroidElement> (new URL("http://0.0.0.0:4723/wd/hub"),cap);
return driver;
	}
}

