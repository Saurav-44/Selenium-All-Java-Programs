package com.library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Reusability {
	public static void CapturedScreenShot(WebDriver driver, String screenShotName) {
		try {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./ScreenShots/" + screenShotName + ".png"));
			
			System.out.println("Captured Screen - By Selenium WebDriver");
		}
		
		catch(Exception e) {
			System.out.println("Exception Screen Shot" + e.getMessage());
		}
	}
}
