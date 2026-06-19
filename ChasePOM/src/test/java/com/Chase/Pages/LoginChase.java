package com.Chase.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginChase {
	WebDriver driver;

	public LoginChase(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(xpath = "//input[@id='userId-text-input-field']")
	WebElement email;

	@FindBy(xpath = "//input[@id='password-text-input-field']")
	WebElement password;

	@FindBy(xpath = "//button[@id='signin-button']")
	WebElement loginbtn;

	public void login_Chase(String uname, String pass) {
		email.sendKeys(uname);
		password.sendKeys(pass);
		loginbtn.click();
	}
}
