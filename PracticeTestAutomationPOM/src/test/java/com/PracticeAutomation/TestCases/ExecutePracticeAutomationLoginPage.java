package com.PracticeAutomation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;


import com.Helper.PracticeAutomationBrowserFactory;
import com.PracticeAutomation.Pages.LoginPracticeAutomation;

public class ExecutePracticeAutomationLoginPage {
	@Test
	public void validateUserExecution() {
		WebDriver driver = PracticeAutomationBrowserFactory.BrowserOptions("chrome",
				"https://practicetestautomation.com/practice-test-login/");

		LoginPracticeAutomation loginPagePracticeAuto = PageFactory.initElements(driver, LoginPracticeAutomation.class);
		loginPagePracticeAuto.login_PracticeAuto("student", "Password123");
	}
}