package com.omrbranch.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0204 {
public void t0204_openlogin() throws InterruptedException {
	
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.instagram.com/");
	driver.manage().window().maximize();
	
	Thread.sleep(1000);
	WebElement txtname = driver.findElement(By.name("username"));
	txtname.sendKeys("velmurugansirgtomr");
	
	WebElement txtpass = driver.findElement(By.name("password"));
	txtpass.sendKeys("Greens@123");
	
	Thread.sleep(5000);
	
	driver.quit();
}

public static void main(String[] args) throws InterruptedException {
	Day2_U0204 a = new Day2_U0204();
	a.t0204_openlogin();
}
}
