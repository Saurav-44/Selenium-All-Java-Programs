package com.LocatorsTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PartialLinkText {

	WebDriver driver;

	@BeforeTest
	public void Setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Test
	public void linkTest() {
		driver.get("https://www.hollandandbarrett.com/");
		driver.findElement(By.xpath("//*[@id=\"oanetrust-accept-btn-handler\"]")).click();
		driver.findElement(By.partialLinkText("vitamins")).click();

		List<WebElement> links = driver.findElements(By.xpath("//a"));
		int linkCount = links.size();

		System.out.println("Number of links: " + linkCount);
		for (int i = 0; i < links.size(); i++) {
			System.out.println(links.get(i).getText());
			String str = links.get(i).getText();
			String str1 = "Vitamins";

			if (str == str1) {
				driver.findElement(By.linkText("Vitamins")).click();
				driver.findElement(By.xpath("(//a[contains(@type, 'button')])[4]")).click();
			}
		}

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
