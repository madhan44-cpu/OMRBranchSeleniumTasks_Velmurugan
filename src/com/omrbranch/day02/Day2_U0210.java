package com.omrbranch.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0210 {
	public static void t0210_openlogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		WebElement txtEmail = driver.findElement(By.id("email"));
		txtEmail.sendKeys("GreenstechChennaiomr@gmail.com");
		WebElement txtPass = driver.findElement(By.id("pass"));
		txtPass.sendKeys("Greens@123");
	}

	public static void main(String[] args) {

		t0210_openlogin();
	}

}
