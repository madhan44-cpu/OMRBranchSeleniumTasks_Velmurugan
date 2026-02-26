package com.omrbranch.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0209 {
	public static void t0209_openlogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		WebElement txtfrom = driver.findElement(By.id("search-box-input"));
		txtfrom.sendKeys("Books");

		
	}

	public static void main(String[] args) {
		t0209_openlogin();
	}
}
