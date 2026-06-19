package com.MultipleFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultipleFrames {

	WebDriver driver;
	String url = "file:///D:/frame.html";

	@BeforeTest
	public void SetUp() throws Exception {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();
		

	}

	@Test
	public void Frames() throws Exception {
		int totalFrame = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames: " + totalFrame);

		driver.switchTo().frame("easycalculation");
		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");
		driver.findElement(By.id("log_email")).sendKeys("7854034761");
		driver.findElement(By.id("log_password")).sendKeys("saurav@123");
		driver.findElement(By.xpath("//input[@name='log_submit']")).click();
		String title = driver.getTitle();
		System.out.println(title);

		driver.navigate().to("file:///D:/frame.html");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/a")).click();
		driver.navigate().to("https://www.selenium.dev/");
		driver.findElement(By.xpath("//span[normalize-space()='Documentation']")).click();
		Thread.sleep(5000);
		String title1 = driver.getTitle();
		System.out.println(title1);

		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
		driver.findElement(By.id("username")).sendKeys("student");
		driver.findElement(By.id("password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@id='submit']")).click();
		String title2 = driver.getTitle();
		System.out.println(title2);
		Thread.sleep(5000);

	}

		@AfterTest
		public void tearDown() {
			driver.quit();
		}

}
