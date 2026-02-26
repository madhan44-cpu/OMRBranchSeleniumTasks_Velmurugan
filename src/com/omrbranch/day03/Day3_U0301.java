package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0301 {
	public static void t0301_login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		txtUsername.sendKeys("greenstechchennaiomr@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password'][1]"));
		txtPassword.sendKeys("Greens@123");
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='login']"));
		btnlogin.click();
	}

	public static void t0302_login() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.xpath("//input[@class='form-control'][1]"));
		txtUsername.sendKeys("greenstechchennaiomr@gmail.com");
		WebElement txtPassword = driver.findElement(By.xpath("//input[@type='password'][1]"));
		txtPassword.sendKeys("Greens@123");
		WebElement btnrmbe = driver.findElement(By.xpath("//input[@type='checkbox']"));
		btnrmbe.click();
		WebElement btnlogin = driver.findElement(By.xpath("//button[@value='login']"));
		btnlogin.click();
	}

	public static void main(String[] args) {
		t0301_login();
		t0302_login();
	}
}
