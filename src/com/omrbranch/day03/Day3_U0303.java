package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0303 {

	public static void t0305_login() {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		WebElement btncnt = driver.findElement(By.xpath("//button[@type='submit']"));
		btncnt.click();
		WebElement txtbox = driver.findElement(By.xpath("//input[@placeholder='Search Amazon']"));
		txtbox.sendKeys("iphone");
		WebElement btnsch = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		 btnsch.click();	
	}
	public static void main(String[] args) {
		t0305_login();
	}
}
