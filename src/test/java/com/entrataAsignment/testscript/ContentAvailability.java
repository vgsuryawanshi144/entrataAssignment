package com.entrataAsignment.testscript;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.entrataAsignment.utils.SeleniumUtility;
import com.entrataAsignment.webpages.HomePage;
import com.entrataAsignment.webpages.Navigations;

public class ContentAvailability extends SeleniumUtility {
	Navigations navigations;
	HomePage homePage;

	@BeforeMethod
	public void navigateTotheWebsite() {
		navigations = new Navigations(driver);
		homePage = new HomePage(driver);
		setUp("Chrome", "https://www.entrata.com/c");
	}

	@Test
	public void contentIsDisplyaed() {
		Boolean isDisplayed = homePage.verifyDynamicContentIsPresent();
		Assert.assertTrue(isDisplayed, "Element is Diplayed");
	}

	@Test
	public void isFooterContentDisplayed() {
		Boolean isDisplayed = homePage.verifyFooterContentIsDisplayed();
		Assert.assertTrue(isDisplayed, "Element is Diplayed");
	}
}
