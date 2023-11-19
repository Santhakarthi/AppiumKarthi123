package AppiumPractisePackage;

import java.io.File;

import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;




public class contextHandlesApiDemos {
@Test
	public void contextHandles() throws Throwable {
		File f = new File("C:\\Users\\Karthikeyan V.H\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			
		service.start();
		//UiAutomator2Options options=new UiAutomator2Options();
		//options.setPlatformName("Android");
		//options.setDeviceName("RedmiNote 9Pro Max");
		//options.setCapability("browserName", "chrome");
		//options.noReset();
		//options.setCapability("chromedriverexecutables", "/Appium/src/test/resources/chromedriver.exe");
		//options.setUdid("88068908");
		
		DesiredCapabilities dc=new DesiredCapabilities();
			dc.setCapability("platformName","Android");
			dc.setCapability("deviceName", "RedmiNote 9ProMax" );
			dc.setCapability("automationName","UiAutomator2");
			dc.setCapability("UDID","88068908");
			dc.setCapability("appPackage","io.appium.android.apis");
			dc.setCapability("appActivity",".ApiDemos");
			dc.setCapability("autoGrantPermissions", true);
			dc.setCapability("ignoreHiddenApiPolicyError", true);
			dc.setCapability("noReset", true);
			URL u=new URL("http://localhost:4723");
			AndroidDriver driver=new AndroidDriver(u,dc);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.accessibilityId("Views")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));")).click();
			Set<String> contextHandles = driver.getContextHandles();
			Thread.sleep(2000);
			System.out.println(contextHandles.size());
			
			for(String s:contextHandles) {
			System.out.println(s);
			
        }
			driver.findElement(AppiumBy.id("i_am_a_textbox")).sendKeys("Karthi");
			
		service.stop();
			
			
			
			
	}
}
