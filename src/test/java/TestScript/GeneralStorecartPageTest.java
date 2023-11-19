package TestScript;


import java.time.Duration;


import org.testng.annotations.Test;

import com.generalstore.genericutility.BaseAppiumClass;

public class GeneralStorecartPageTest extends BaseAppiumClass {
	@Test
	public void cartPageList() throws Throwable {
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		Thread.sleep(3000);
		pp.addTocartPage();
		Thread.sleep(4000);
		cp.purchaselinkBtn();
		
}
}