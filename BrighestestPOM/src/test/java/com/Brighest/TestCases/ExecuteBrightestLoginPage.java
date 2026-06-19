package com.Brighest.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Helper.BrightestBrowserFactory;
import com.Brightest.Pages.LoginBrightest;

public class ExecuteBrightestLoginPage {
	@Test
	public void validateUserExecution() throws Exception {
		WebDriver driver = BrightestBrowserFactory.BrowserOptions("chrome", "https://profile.brightest.org/accounts/signup/");

		LoginBrightest loginPageBrightest = PageFactory.initElements(driver, LoginBrightest.class);
		loginPageBrightest.login_Brightest("saurav@123", "saurav@123", "Password1234", "Password1234");
	}
}
