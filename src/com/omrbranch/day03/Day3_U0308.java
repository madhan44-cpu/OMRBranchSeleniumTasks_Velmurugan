package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0308 {
	public static void t0310_login() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com");
		WebElement btnlgn = driver.findElement(By.xpath("//a[@title='Login'][1]"));
		btnlgn.click();
		WebElement txtto = driver.findElement(By.xpath("//input[@class='c3Bd2c yXUQVt']"));
		txtto.sendKeys("9751697826");
		WebElement btndate = driver.findElement(By.xpath("//button[@class='dSM5Ub Kv3ekh KcXDCU']"));
		btndate.click();
	}

	public static void main(String[] args) {
		t0310_login();
	}

}
