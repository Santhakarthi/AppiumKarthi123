package TestScript;


import java.time.Duration;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generalstore.genericutility.BaseAppiumClass;
@Listeners(com.generalstore.genericutility.ListnerImplementationClass.class)
public class GeneralstoreLoginTest  extends BaseAppiumClass{
	@Test

	public void CompatibilityTesting() throws Throwable {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
Assert.assertEquals(false, true);
	pp.addTocartPage();
		
}
}