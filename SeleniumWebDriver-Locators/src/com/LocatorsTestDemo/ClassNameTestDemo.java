package com.LocatorsTestDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassNameTestDemo {
	public void TestDemo () throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.hollandandbarrett.com/shop/vitamins-supplements/vitamins/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\\\"onetrust-accept-btn-handler\\\"]")).click();
		driver.findElement(By.className("NavCategoryItem-module_categoryImage__mk1mV")).click();
		
		
		String title = "Multivitamins";
		System.out.println(title);
		
		WebElement currTitle = driver.findElement(By.className("PLPTitleWidget-module_title__RpLG8"));
		String title1 = currTitle.getText();
		
		if(title.equals(title1)) {
			System.out.println("Passed");
		}
		
		else {
			System.out.println("Failed");
		}
		
		String currUrl = driver.getCurrentUrl();
		System.out.println("currUrl");
		
		
		
	}
}
