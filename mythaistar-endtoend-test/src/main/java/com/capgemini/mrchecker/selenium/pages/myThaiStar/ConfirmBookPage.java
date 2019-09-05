package com.capgemini.mrchecker.selenium.pages.myThaiStar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.capgemini.mrchecker.selenium.core.BasePage;
import com.capgemini.mrchecker.test.core.logger.BFLogger;

public class ConfirmBookPage extends BasePage {
	private static final By selectorConfirmationWindow = By.className("mat-dialog-container");
	
	private static final By selectorSendButton = By.name("bookTableConfirm");
	
	private static final By selectorCancelButton = By.name("bookTableCancel");
	
	@Override
	public boolean isLoaded() {
		getDriver().waitForElementVisible(selectorConfirmationWindow);
		WebElement confirmationWindow = getDriver().findElementQuietly(selectorConfirmationWindow);
		return confirmationWindow != null ? confirmationWindow.isDisplayed() : false;
	}
	
	@Override
	public void load() {
		BFLogger.logError("MyThaiStar booking confirmation page was not loaded.");
	}
	
	@Override
	public String pageTitle() {
		return "My Thai Star";
	}
	
	public void clickConfirmBookingButton() {
		getDriver().findElementDynamic(selectorSendButton)
				.click();
	}
	
	public void clickCancelBookingButton() {
		getDriver().findElementDynamic(selectorCancelButton)
				.click();
	}
}
