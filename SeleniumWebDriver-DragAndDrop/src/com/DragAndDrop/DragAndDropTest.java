package com.DragAndDrop;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DragAndDropTest {

	WebDriver driver;
	String url = "https://jqueryui.com/droppable/";

	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}

	@Test
	public void dragAndDrop() {
		driver.switchTo().frame(0);
		
		Actions action = new Actions(driver);
		
		action.clickAndHold(driver.findElement(By.xpath("//p[normalize-space()='Drag me to my target']"))).moveToElement(driver.findElement(By.xpath("//div[@id='droppable']"))).release().build().perform();
	}

	@AfterTest
	public void endTest() {
		driver.quit();
	}
}
