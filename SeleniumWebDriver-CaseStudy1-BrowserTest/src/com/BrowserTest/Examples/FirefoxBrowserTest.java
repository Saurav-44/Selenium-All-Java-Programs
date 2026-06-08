package com.BrowserTest.Examples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxBrowserTest {

	
	@Test
	public void FirefoxTest1() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void FirefoxTest2() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void FirefoxTest3() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.bing.com");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void FirefoxTest4() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.freecrm.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void FirefoxTest5() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.chase.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void FirefoxTest6() {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://altoro.testfire.net/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void FirefoxTest7() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void FirefoxTest8() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://practicetestautomation.com/practice-test-login/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
	@Test
	public void FirefoxTest9() {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
	}
	
}
