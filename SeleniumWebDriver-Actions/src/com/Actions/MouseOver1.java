
package com.Actions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseOver1 {

	WebDriver driver;
	String url = "https://www.nopcommerce.com/en";

	@BeforeTest
	public void SetUp() throws Exception {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	@Test
	public void mouseOver() throws Exception {
		WebElement ele = driver.findElement(By.xpath("//span[normalize-space()='Support & services']"));
		Actions act = new Actions(driver);
		act.moveToElement(ele).build().perform();

		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[normalize-space()='Training']")).click();

		System.out.println(driver.getCurrentUrl());

		Thread.sleep(5000);

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Number of links: " + links.size());

		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Number of images: " + images.size());

		Thread.sleep(6000);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
