package com.generalstore.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class cartPage {
	AndroidDriver driver;
@FindBy (id="com.androidsample.generalstore:id/btnProceed")
private WebElement completePurchaseBtn;
public cartPage(AndroidDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}

public WebElement getCompletePurchaseBtn() {
	return completePurchaseBtn;
}
public void purchaselinkBtn() {
	completePurchaseBtn.click();
}
}
