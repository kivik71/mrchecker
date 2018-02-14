package com.capgemini.ntc.selenium.pages.projectY.gmail;

import org.openqa.selenium.By;

import com.capgemini.ntc.selenium.core.BasePage;

public class GmailAboutPage extends BasePage {
	
	private static final By selectorSignInButton = By.cssSelector("a.gmail-nav__nav-link__sign-in");
	
	private static final String	GMAIL_ABOUT_URL			= "https://www.google.com/gmail/about/#";
	private static final String	GMAIL_ABOUT_PAGE_TITLE	= "Gmail - Free Storage and Email from Google";
	
	@Override
	public boolean isLoaded() {
		getDriver().waitForPageLoaded();
		return getDriver().getCurrentUrl()
						.contains("gmail/about/#");
	}
	
	@Override
	public void load() {
		getDriver().get(GMAIL_ABOUT_URL);
	}
	
	@Override
	public String pageTitle() {
		return GMAIL_ABOUT_PAGE_TITLE;
	}
	
	public GmailSignInPage clickSignInButton() {
		getDriver().elementButton(selectorSignInButton)
						.click();
		return new GmailSignInPage();
	}
	
}
