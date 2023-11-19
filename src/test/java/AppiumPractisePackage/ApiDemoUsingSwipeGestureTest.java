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

public class ApiDemoUsingSwipeGestureTest {

	@Test
	public void Swipe() throws Throwable {
		File f = new File("C:\\Users\\Karthikeyan V.H\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			
		service.start();
			DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("platformName","Android");
			dc.setCapability("deviceName", "RedmiNote 9ProMax" );
			dc.setCapability("automationName","UiAutomator2");
			dc.setCapability("UDID","88068908");
			dc.setCapability("appPackage","io.appium.android.apis");
			dc.setCapability("appActivity",".ApiDemos");
			//dc.setCapability("autoGrantPermissions", true);
			//dc.setCapability("ignoreHiddenApiPolicyError", true);
			//dc.setCapability("noReset", true);
			URL u=new URL("http://localhost:4723");
			AndroidDriver driver=new AndroidDriver(u,dc);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
			driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
			WebElement element = driver.findElement(AppiumBy.xpath("//android.widget.ImageView[@index='0']"));
			((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
					 "elementId", ((RemoteWebElement) element).getId(),
				    "direction", "left",
				    "percent", 0.75
				));
			service.stop();
			
	}
}
