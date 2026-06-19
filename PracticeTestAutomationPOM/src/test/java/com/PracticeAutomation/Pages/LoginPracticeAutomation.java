package com.PracticeAutomation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPracticeAutomation {
	WebDriver driver;

	public LoginPracticeAutomation(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(id = "username")
	WebElement email;

	@FindBy(name = "password")
	WebElement password;

	@FindBy(xpath = "//button[@id='submit']")
	WebElement loginbtn;

	public void login_PracticeAuto(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
}
