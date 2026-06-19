package com.EasyCalculation.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.EasyCalculations.Pages.LoginEasyCal;
import com.Helper.BrowserFactory;

public class ExecuteLoginPage {
	
	@Test
	public void validateUserExecution() {
		WebDriver driver = BrowserFactory.BrowserOptions("chrome", "https://www.login.hiox.com/login?referrer=easycalculation.com");
		
		LoginEasyCal loginPageEasyCal = PageFactory.initElements(driver, LoginEasyCal.class);
		loginPageEasyCal.login_EasyCal("saurav@345", "7865497789");
	}

}
