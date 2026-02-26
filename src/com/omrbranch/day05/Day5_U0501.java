package com.omrbranch.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_U0501 {
	public static void t0501_login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		driver.manage().window().maximize();
		WebElement txtemail = driver.findElement(By.xpath("//input[@id='email']"));
		boolean enabled = txtemail.isEnabled();
		System.out.println(enabled);
		boolean displayed = txtemail.isDisplayed();
		System.out.println(displayed);

		if (enabled && displayed) {
			txtemail.clear();
			txtemail.sendKeys("greenstechchennaiomr@gmail.com");
			String text = txtemail.getDomProperty("value");
			System.out.println(text);
		}
		WebElement txtpass = driver.findElement(By.xpath("//input[@type='password']"));
		boolean enabled2 = txtpass.isEnabled();
		System.out.println(enabled2);
		boolean displayed2 = txtpass.isDisplayed();
		System.out.println(displayed2);
		if (enabled2 && displayed2) {
			txtpass.clear();
			txtpass.sendKeys("Greens@123");
			String text2 = txtpass.getDomProperty("value");
			System.out.println(text2);
		}
	}

	public static void main(String[] args) {
		t0501_login();
	}
}