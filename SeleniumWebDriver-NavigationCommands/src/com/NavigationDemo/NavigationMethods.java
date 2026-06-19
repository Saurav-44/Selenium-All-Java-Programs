package com.NavigationDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NavigationMethods {
	
	WebDriver driver;
	
//	@Test
//	public void navigationToMethods() {
//		driver = new ChromeDriver();
//		driver.navigate().to("https://www.bing.com");
//		String title = driver.getTitle();
//		System.out.println(title);
//		String URL = driver.getCurrentUrl();
//		System.out.println(URL);
//		driver.quit();
//	}
	
//	@Test
//	public void navigateBack() {
//	    driver = new ChromeDriver();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		String URL = driver.getCurrentUrl();
//		System.out.println(URL);
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		driver.navigate().back();
//		URL = driver.getCurrentUrl();
//		System.out.println(URL);
//		
//		
//		
//	}
	
	
//	@Test
//	public void refreshMethod() {
//	    driver = new ChromeDriver();
//		driver.get("https://practicetestautomation.com/practice-test-login/");
//		String URL = driver.getCurrentUrl();
//		System.out.println(URL);
//		driver.navigate().refresh();
//		
//		
//		
//		driver.navigate().refresh();
//		URL = driver.getCurrentUrl();
//		System.out.println(URL);
//		
//		
//		
//	}
	
	@Test
	public void navigateForward() throws Exception {
	    driver = new ChromeDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		Thread.sleep(2000);
//		String URL = driver.getCurrentUrl();
//		System.out.println(URL);
//		String title = driver.getTitle();
//		System.out.println(title);
		
		driver.navigate().to("https://www.freecrm.com/");
		Thread.sleep(2000);
//		URL = driver.getCurrentUrl();
//		System.out.println(URL);
		
		driver.navigate().back();
		Thread.sleep(2000);
//		URL = driver.getCurrentUrl();
//		System.out.println(URL);
		
		driver.navigate().forward();
//		Thread.sleep(2000);
//		URL = driver.getCurrentUrl();
//		System.out.println(URL);
		
		driver.quit();
		
		
		
		
		
	}
	
	
	
}
