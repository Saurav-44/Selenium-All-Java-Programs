package com.DropDown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DropDownTest {

    WebDriver driver;
    String url = "https://testautomationpractice.blogspot.com/";

    @BeforeTest
    public void setUp() {

        driver = new ChromeDriver();
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    @Test
    public void dropDownList() throws Exception {

        WebElement countryDropDown = driver.findElement(By.id("country"));

        Select countryList = new Select(countryDropDown);

        countryList.selectByIndex(3);
        countryList.selectByVisibleText("India");
        
        WebElement option = countryList.getFirstSelectedOption();

        String countryName = option.getText();
        System.out.println("Selected Country: " + countryName);

        List<WebElement> list = countryList.getOptions();

        int totalCountry = list.size();

        System.out.println("Total countries count in list: " + totalCountry);

        for (WebElement ele : list) {
            String counName = ele.getText();
            System.out.println("Country Names in list: " + counName);
        }
    }

    @AfterTest
    public void tearDown() {

        driver.quit();
    }
}