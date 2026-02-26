package com.omrbranch.day04;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_U0405 {
	public static void t0405_login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://greenstech.in/selenium-course-content.html");
		driver.manage().window().maximize();
		WebElement btnoverview = driver.findElement(By.xpath("//a[@id='overview-tab']"));
		btnoverview.click();
		@Nullable
		String title = btnoverview.getText();
		System.out.println(title);

	}

	public static void main(String[] args) {
		t0405_login();
	}
}
