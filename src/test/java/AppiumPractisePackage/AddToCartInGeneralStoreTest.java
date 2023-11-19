package AppiumPractisePackage;

import java.io.File;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class AddToCartInGeneralStoreTest {
	@Test

	public void ProductListAddCart() throws Throwable {
		File f = new File("C:\\Users\\Karthikeyan V.H\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			
		service.start();
		
		
		
		
			DesiredCapabilities dc=new DesiredCapabilities();
			
			dc.setCapability("platformName","Android");
			dc.setCapability("deviceName", "RedmiNote 9ProMax" );
			dc.setCapability("automationName","UiAutomator2");
			dc.setCapability("UDID","88068908");
			dc.setCapability("appPackage","com.androidsample.generalstore");
			dc.setCapability("appActivity",".SplashActivity");
			;
			//dc.setCapability("autoGrantPermissions", true);
			//dc.setCapability("ignoreHiddenApiPolicyError", true);
			//dc.setCapability("noReset", true);
			URL u=new URL("http://localhost:4723");
			AndroidDriver driver=new AndroidDriver(u,dc);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/spinnerCountry")).click();
			driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"India\"));")).click();
			driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/nameField")).sendKeys("Karthikeyan");
			driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/radioMale")).click();
			driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']")).click();
driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
String a=driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/productName")).getText();
System.out.println(a);
String b="Air Jordan 4 Retro";
Assert.assertEquals(a, b);
service.stop();
	}
}
