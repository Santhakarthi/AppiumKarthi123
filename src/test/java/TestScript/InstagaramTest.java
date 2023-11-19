package TestScript;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class InstagaramTest {

	@Test
		public void ScrollReels() throws Throwable {
			File f = new File("C:\\Users\\Karthikeyan V.H\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
			AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
				
			service.start();
			DesiredCapabilities dc=new DesiredCapabilities();
				dc.setCapability("platformName","Android");
				dc.setCapability("deviceName", "RedmiNote 9ProMax" );
				dc.setCapability("automationName","UiAutomator2");
				dc.setCapability("UDID","88068908");
				dc.setCapability("appPackage","com.instagram.android");
				dc.setCapability("appActivity","com.instagram.mainactivity.InstagramMainActivity");
				
				//dc.setCapability("autoGrantPermissions", true);
				//dc.setCapability("ignoreHiddenApiPolicyError", true);
				//dc.setCapability("noReset", true);
				URL u=new URL("http://localhost:4723");
				AndroidDriver driver=new AndroidDriver(u,dc);
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
				driver.findElement(AppiumBy.xpath("(//android.widget.LinearLayout[@index='0'])[4]")).click();
				driver.findElement(AppiumBy.xpath("//android.widget.EditText[@index='2']")).sendKeys("Karthi@123");
				driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@index='0'])[13]")).click();
				driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@index='0'])[9]")).click();
				driver.findElement(AppiumBy.xpath("(//android.widget.ImageView[@index='0'])[9]")).click();
				 String e = driver.findElement(AppiumBy.id("com.instagram.android:id/row_feed_photo_profile_name")).getText();
				driver.findElement(AppiumBy.androidUIAutomator ("new UiScrollable(new UiSelector()).scrollIntoView(text(\""+e+"\"));"));
				
	}

}
