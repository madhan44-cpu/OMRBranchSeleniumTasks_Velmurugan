package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0309 {

	public static void t0311_login()

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		WebElement txtbar = driver.findElement(By.xpath("//input[@type='text']"));
		txtbar.sendKeys("books",Keys.ENTER);
	}

	public static void main(String[] args) {
		t0311_login();

	}
}