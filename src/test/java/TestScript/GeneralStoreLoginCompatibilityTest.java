package TestScript;

import java.io.File;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class GeneralStoreLoginCompatibilityTest{
@Parameters({"deviceName","UDID","port"})
@Test
	public void CompatibilityTesting(String deviceName,String UDID,int port) throws Throwable {
	File f = new File("C:\\Users\\Karthikeyan V.H\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
	AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).
			withIPAddress("127.0.0.1").usingPort(port).withTimeout(Duration.ofSeconds(300)).build();
		
	service.start();
	//UiAutomator2Options options=new UiAutomator2Options();
	//options.setPlatformName("Android");
//options.setDeviceName("deviceName");
   // options.setUdid(UDID);
   //options.setAdbPort(port);
  // options.setAppPackage("com.androidsample.generalstore");
 //  options.setAppActivity(".SplashActivity");
//	options.setCapability("browserName", "chrome");
	//options.noReset();
	//options.setCapability("chromedriverexecutables", "/Appium/src/test/resources/chromedriver.exe");
	//options.setUdid("88068908");
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability("platformName","Android");
		dc.setCapability("deviceName", deviceName );
		dc.setCapability("automationName","UiAutomator2");
	dc.setCapability("UDID",UDID);
	dc.setCapability("appPackage","com.androidsample.generalstore");
	dc.setCapability("appActivity",".SplashActivity");
		//dc.setCapability("autoGrantPermissions", true);
		//dc.setCapability("ignoreHiddenApiPolicyError", true);
		//dc.setCapability("noReset", true);
		URL u=new URL("http://localhost:"+port+"");
		AndroidDriver driver=new AndroidDriver(u,dc);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
	driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")).click();
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Karthikeyan");
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioMale")).click();
	driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
		service.stop();
	}
}
