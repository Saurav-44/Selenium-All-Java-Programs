package com.Chase.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.Chase.Pages.LoginChase;
import com.Helper.ChaseBrowserFactory;

public class ExecuteLoginChasePage {
	
	@Test
	public void validateUserExecution() throws Exception {
		
		WebDriver driver = ChaseBrowserFactory.BrowserOptions("chrome", "https://www.chase.com/");
		
		
		
		LoginChase loginPageChase = PageFactory.initElements(driver, LoginChase.class);
		Thread.sleep(6000);
		loginPageChase.login_Chase("saurav@123", "32142");
		
		
		
	}
	
}
