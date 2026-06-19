package com.Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ScrollUpandDownTest {

	WebDriver driver;
	String url1 = "https://www.nopcommerce.com/en/training";
	String url2 = "https://testautomationpractice.blogspot.com/";
	String url3 = "https://www.freecrm.com/";
	String url4 = "https://www.spicejet.com/";
	String url5 = "https://demoqa.com/";
			

	@Test(priority = 0)
	public void TestScrollAndDown1() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url1);
		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("scroll(0, 6600)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)", " ");
		
		driver.quit();
	}
	
	@Test(priority = 1)
	public void TestScrollAndDown2() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url2);
		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("scroll(0, 6600)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)", " ");
		
		driver.quit();
	}
	
	@Test(priority = 2)
	public void TestScrollAndDown3() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url3);
		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("scroll(0, 6600)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)", " ");
		
		driver.quit();
	}
	
	@Test(priority = 3)
	public void TestScrollAndDown4() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url4);
		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("scroll(0, 6600)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)", " ");
		
		driver.quit();
	}
	
	@Test(priority = 4)
	public void TestScrollAndDown5() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url5);
		Thread.sleep(10000);

		((JavascriptExecutor) driver).executeScript("scroll(0, 6600)");
		Thread.sleep(6000);
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-4200)", " ");
		
		driver.quit();
	}

}
