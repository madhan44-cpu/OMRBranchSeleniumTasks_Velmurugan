package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0313 {
	public static void t0315_login()

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		WebElement btnlgn = driver.findElement(By.xpath("//div[@id='buttons']"));
		btnlgn.click();
		WebElement btnemail = driver.findElement(By.xpath("//input[@type='email']"));
		btnemail.sendKeys("greenstechchennaiomr@gmail.com");
		WebElement btnnext = driver.findElement(By.xpath("//span[text()='Next']"));
		btnnext.click();
	}

	public static void main(String[] args) {
		t0315_login();
	}
}
