package com.omrbranch.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10_U1004 {
	public static void t1010_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement ddlday = driver.findElement(By.id("days"));
		Select select = new Select(ddlday);
		select.selectByIndex(5);

		WebElement ddlmonth = driver.findElement(By.xpath("//select[@id='months']"));
		Select selectmonth = new Select(ddlmonth);
		selectmonth.selectByVisibleText("March");

		WebElement ddlyear = driver.findElement(By.id("dob"));
		Select selectyear = new Select(ddlyear);
		selectyear.selectByValue("1990");
	}

	public static void main(String[] args) {
		t1010_login();
	}
}
