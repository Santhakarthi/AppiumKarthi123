package AppiumPractisePackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class DragAndDropUsingStartXAndStartY {

	public void dragDrop() throws Throwable {
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
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			"StartX",246,
			"StartY",629,
		     "endX", 715,
		     "endY", 1086
				));
			
		String a	= driver.findElement(AppiumBy.id("io.appium.android.apis:id/drag_result_text")).getText();
		System.out.println(a);
		String b="Dropped!";
		Assert.assertEquals(a, b);
			service.stop();
	}
	
}
