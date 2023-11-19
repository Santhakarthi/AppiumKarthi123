package com.generalstore.objectrepo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;

public class ProductPage {

	AndroidDriver driver;
	
		@FindBy(xpath="//android.widget.TextView[@text='Air Jordan 4 Retro']/..//android.widget.TextView[@text='ADD TO CART']")
	private WebElement addTocartClick;
		
		@FindBy(id="com.androidsample.generalstore:id/appbar_btn_cart")
		private WebElement addToCartBtn;
		
		public ProductPage(AndroidDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	
		public WebElement getAddTocartClick() {
			return addTocartClick;
		}
	
		public WebElement getAddToCartBtn() {
			return addToCartBtn;
		}

		
		public void addTocartPage() {
			addTocartClick.click();
			addToCartBtn.click();
		}
		
		
		
		
}
