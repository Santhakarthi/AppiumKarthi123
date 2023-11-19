package NowServing;

import java.io.File;
import java.net.URL;
import java.time.Duration;
import java.util.List;

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

public class Openapplication {
	@Test
	public void openApp() throws Throwable {
		File f = new File
		("C:\\Users\\Karthikeyan V.H\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js");
		AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(f).
				withIPAddress("127.0.0.1").usingPort(4723).withTimeout(Duration.ofSeconds(300)).build();
			
		service.start();
		
			DesiredCapabilities dc=new DesiredCapabilities();
		
			dc.setCapability("platformName","Android");
			dc.setCapability("deviceName", "RedmiNote 9ProMax" );
			dc.setCapability("automationName","UiAutomator2");
			dc.setCapability("UDID","88068908");
			dc.setCapability("appPackage","com.leapfroggr.nowserving");
			dc.setCapability("appActivity",".MainActivity");
			
			URL u=new URL("http://localhost:4723");
			AndroidDriver driver = new AndroidDriver(u,dc);
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			Thread.sleep(4000);
			driver.hideKeyboard();
			//driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Enter your mobile number and get started']/..//android.view.ViewGroup/..//android.widget.TextView[@text='🇵🇭']")).click();
			driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@index='1'])[5]")).click();			
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='🇵🇭']")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Enter country name' and @index='1']")).sendKeys("India");
	WebElement e = driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='India (+91)']"));
		  ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture", ImmutableMap.of(
				    "elementId", ((RemoteWebElement) e).getId(),"duration",5000
				));
		  Thread.sleep(3000);
		  driver.findElement(AppiumBy.xpath("//android.widget.EditText[@text='Mobile Number']")).sendKeys("6382121323");
		  driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='CONTINUE']")).click();
			//driver.findElement(AppiumBy.xpath("(//android.view.ViewGroup[@index='1'])[5]")).click();


		
}
}
