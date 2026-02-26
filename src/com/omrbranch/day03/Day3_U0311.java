package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0311 {
	public static void t0313_login()

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		WebElement txtbar = driver.findElement(By.xpath("//input[@id='location']"));
		txtbar.sendKeys("chennai");
		WebElement txtrstrnt = driver.findElement(By.xpath("//div[@class='sc-aXZVg iGFOtL']"));
		txtrstrnt.sendKeys("Domino's pizza");
	}

	public static void main(String[] args) {
		t0313_login();

	}
}
