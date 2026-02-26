package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0306 {
	public static void t0308_login() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstech.in/selenium-course-content.html");
		WebElement btnitv = driver.findElement(By.xpath("//div[@id='heading20']"));
		btnitv.click();
		WebElement btntcs = driver.findElement(By.xpath("//a[text()='TCS Interview Question ']"));
		btntcs.click();
	}

	public static void main(String[] args) {
		t0308_login();
	}

}
