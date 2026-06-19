package com.Alerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Utility.Helper;

public class DemoAlerts {
	
	WebDriver driver;
	String url = "https://mail.rediff.com/cgi-bin/login.cgi";
	
	@BeforeTest
	public void SetUp() {
		driver = new ChromeDriver();
		driver.navigate().to(url);
		driver.manage().window().maximize();

	}
	
	
	@Test
	public void TestPopups() throws Exception {
		WebDriver driver = Helper.StartBrowser("GC");
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		
		String text = alert.getText();
		
		if(text.equals("Please Enter Email")) {
			System.out.println("Correct Alert Message");
		}
		
		else {
			System.out.println("In-Correct Alert Message");
		}
		
		alert.accept();
				
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
	
}
