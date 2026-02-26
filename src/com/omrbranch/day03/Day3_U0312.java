package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0312 {
	public static void t0314_login()

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement txtbar = driver.findElement(By.xpath("//textarea[@name='q']"));
		txtbar.sendKeys("Greens Tech Chennai OMR Branch",Keys.ENTER);
//		WebElement btnsrch = driver.findElement(By.xpath("//input[@value='Google Search']"));
//		 btnsrch.click();
	}

	public static void main(String[] args) {
		t0314_login();

	}
}
