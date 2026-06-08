package com.SeleniumFirefoxDriver.Browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxBrowserTest {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.selenium.dev/downloads/");
//		driver.manage().window().maximize();
		driver.manage().window().minimize();

	}

}
