package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0304 {
	public static void t0306_login() {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		WebElement txtusrnme = driver.findElement(By.xpath("//input[@type='text'][1]"));
		txtusrnme.sendKeys("velmurugansiromrbranch@gmail.com.");
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		txtpass.sendKeys("Greens@123");
		WebElement btnlgn = driver.findElement(By.xpath("//button[@name='login']"));
		btnlgn.click();	
	}
	public static void main(String[] args) {
		t0306_login();
	}
}
