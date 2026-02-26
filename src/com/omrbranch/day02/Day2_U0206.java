package com.omrbranch.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0206 {
	public static void t0206_openlogin() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();

		WebElement txtcom = driver.findElement(By.id("APjFqb"));
		txtcom.sendKeys("Greens Tech Chennai OMR  Branch");		

		driver.quit();
	}

	public static void main(String[] args) {

		t0206_openlogin();
	}

}
