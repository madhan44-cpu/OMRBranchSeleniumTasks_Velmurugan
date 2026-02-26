package com.omrbranch.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0205 {
	public static void t0205_openlogin() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.manage().window().maximize();

		driver.switchTo().frame("login_page");
		
		WebElement txtuserId = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		
		
		txtuserId.sendKeys("greensOmrBranch");
		
	}

	public static void main(String[] args) throws InterruptedException {

		t0205_openlogin();
	}
}
