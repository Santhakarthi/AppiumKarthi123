package TestScript;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import com.generalstore.genericutility.BaseAppiumClass;
import com.generalstore.objectrepo.LoginPage;
import com.generalstore.objectrepo.ProductPage;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class GeneralstoreProductPageTest extends BaseAppiumClass {
	
	@Test
	public void AddToCart() throws Throwable {
			;
		//dc.setCapability("autoGrantPermissions", true);
		//dc.setCapability("ignoreHiddenApiPolicyError", true);
		//dc.setCapability("noReset", true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		pp.addTocartPage();
		
		
}
}