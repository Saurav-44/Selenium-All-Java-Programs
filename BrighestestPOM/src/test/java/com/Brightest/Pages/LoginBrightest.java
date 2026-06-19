package com.Brightest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginBrightest {
	WebDriver driver;

	public LoginBrightest(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(name = "email")
	WebElement email;
	
	@FindBy(name = "email2")
	WebElement confirmEmail;

	@FindBy(name = "password1")
	WebElement password;
	
	@FindBy(name = "password2")
	WebElement confirmPassword;
	
	@FindBy(name = "i_agree")
	WebElement checkBox;

	@FindBy(xpath = "//button[normalize-space()='Create Account']")
	WebElement loginbtn;

	public void login_Brightest(String email1, String email2, String pass1, String pass2) {
		email.sendKeys(email1);
		confirmEmail.sendKeys(email2);
		password.sendKeys(pass1);
		confirmPassword.sendKeys(pass2);
		checkBox.click();
		loginbtn.click();
	}
}
