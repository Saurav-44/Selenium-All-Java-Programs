package com.LocatorsTestDemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TagNameDemo {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hollandandbarrett.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")).click();

		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());

		for (WebElement ele : links) {
			System.out.println(ele.isDisplayed());
			System.out.println(ele.isEnabled());
			System.out.println(ele.getAttribute("href"));

		}

		// Click on 4th link
		WebElement ele = links.get(3);
		ele.click();
		
//		String url = driver.getCurrentUrl();
//		String expectedUrl = "https://help.hollandandbarrett.com/hc/en-gb";
//		
//		if(url.contains(expectedUrl)) {
//			System.out.println("");
//		}
		
	}

}
