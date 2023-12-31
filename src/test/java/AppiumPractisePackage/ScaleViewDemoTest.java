package AppiumPractisePackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ScaleViewDemoTest {
@Test
	public void Image() throws Throwable {
	File f = new File("C:\\Users\\Karthikeyan V.H\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
		
	service.start();
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("deviceName", "RedmiNote 9ProMax" );
		dc.setCapability("automationName","UiAutomator2");
		dc.setCapability("UDID","88068908");
		dc.setCapability("appPackage","com.davemorrissey.labs.subscaleview.sample");
		dc.setCapability("appActivity",".MainActivity");
		URL u=new URL("http://localhost:4723");
		AndroidDriver driver=new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(AppiumBy.id("com.android.permissioncontroller:id/continue_button")).click();
		driver.findElement(AppiumBy.id("android:id/button1")).click();
		driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/basicFeatures")).click();
	WebElement element = driver.findElement(AppiumBy.id("com.davemorrissey.labs.subscaleview.sample:id/imageView"));
	((JavascriptExecutor) driver).executeScript("mobile: pinchOpenGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "percent", 0.75
		));
	Thread.sleep(3000);
	((JavascriptExecutor) driver).executeScript("mobile: pinchCloseGesture", ImmutableMap.of(
		    "elementId", ((RemoteWebElement) element).getId(),
		    "percent", 0.75
		));
	
	service.stop();
	}
}
