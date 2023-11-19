package BROWSERSTACK;


import java.net.URL;

import java.util.HashMap;

import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class BrowserAutomationTest {
public static final String username="karthikeyan_fHyEJZ";
public static final String accessKey="F8spkji1RYsEuoSMG5uA";
public static final String url="https://"+username+":"+accessKey+"@hub-cloud.browserstack.com/wd/hub ";

@Test
public void browserAutomation() throws Throwable {
/*	DesiredCapabilities dc=new DesiredCapabilities();
	
	dc.setCapability("os","windows");
	dc.setCapability("os_version", "10.0" );
	dc.setCapability("browser","chrome");
	dc.setCapability("browser_version","118");
	dc.setCapability("name","BrowserAutomation_Browserstack");
	
	
	WebDriver driver=new RemoteWebDriver(new URL(url),dc);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.get("https://facebook.com");
*/
ChromeOptions browserOptions=new  ChromeOptions();
browserOptions.setPlatformName("windows 11");
browserOptions.setBrowserVersion("latest");
HashMap<String,Object> sauceOptions=new HashMap();
sauceOptions.put("username", username);
sauceOptions.put("accessKey", accessKey);
sauceOptions.put("build", "selenium-build-1.1.5");
sauceOptions.put("name", "<get title of webpage>");

browserOptions.setCapability("sauce:options" ,sauceOptions);

RemoteWebDriver driver=new RemoteWebDriver(new URL(url),browserOptions);
driver.get("https://www.google.com/");
System.out.println(driver.getTitle());

}
}
