package AppiumPractisePackage;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class MobileBrowser {
	@Test
	public void mobileBrowser() throws Throwable {
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("deviceName", "RedmiNote 9ProMax" );
		dc.setCapability("automationName","UiAutomator2");
		dc.setCapability("UDID","88068908");
		dc.setCapability("autoGrantPermissions", true);
		dc.setCapability("ignoreHiddenApiPolicyError", true);
		dc.setCapability("noReset", true);
        dc.setCapability("browserName", "chrome");
         URL u=new URL("http://localhost:4723");
 		AndroidDriver driver=new AndroidDriver(u,dc);
 		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
 		driver.get("https://www.facebook.com/");
 		driver.findElement(AppiumBy.xpath("//a[text()='English (UK)']")).click();
 		Thread.sleep(3000);
 		driver.findElement(AppiumBy.xpath("//input[@placeholder='Mobile number or email address']")).sendKeys("xyz");
	}

}
