package BROWSERSTACK;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MobileAppTesting {
	public static final String username="karthikeyan_fHyEJZ";
	public static final String accessKey="F8spkji1RYsEuoSMG5uA";
	public static final String url="https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub ";
	
	
//	bs://ecb6787f2428f77892c682534c45a8d8b0cee50a
	
	
	
	@Test
public void mobileApp() throws Throwable {
	DesiredCapabilities dc=new DesiredCapabilities();
	dc.setCapability("deviceName","Google Pixel 5");
	dc.setCapability("os_version", "11.0");
	dc.setCapability("build", "API_Demos_1.1.2");
	dc.setCapability("name", "API_DEMOS_Browserstack");
	dc.setCapability("app", "bs://ecb6787f2428f77892c682534c45a8d8b0cee50a");
	
	AndroidDriver driver=new AndroidDriver(new URL(url),dc);
	driver.findElement(AppiumBy.accessibilityId("Text")).click();
	driver.findElement(AppiumBy.accessibilityId("LogTextBox")).click();
	driver.findElement(AppiumBy.id("io.appium.android.apis:id/text")).sendKeys("karthi");
	driver.findElement(AppiumBy.accessibilityId("Add")).click();
	
	
}

}
