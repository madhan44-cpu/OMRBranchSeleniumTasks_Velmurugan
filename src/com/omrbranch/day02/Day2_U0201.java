package com.omrbranch.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0201 {
	public void t02021_openlogin() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.id("email"));
		txtUsername.sendKeys("greenstechchennaiomr@gmail.com");
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Greens@123");
		
		driver.quit();
	}

	public static void main(String[] args) {
		Day2_U0201 a = new Day2_U0201();
		a.t02021_openlogin();

	}

}
