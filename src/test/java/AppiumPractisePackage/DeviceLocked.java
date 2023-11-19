package AppiumPractisePackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DeviceLocked {
@Test
	public void LockedOrNot() throws Throwable {
		File f = new File("C:\\Users\\Karthikeyan V.H\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			
		service.start();
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("platformName","Android");
			dc.setCapability("deviceName", "RedmiNote 9ProMax" );
			dc.setCapability("automationName","UiAutomator2");
			dc.setCapability("UDID","88068908");
			URL u=new URL("http://localhost:4723");
			AndroidDriver driver=new AndroidDriver(u,dc);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			System.out.println(driver.isDeviceLocked());
			service.stop();
	}
}
