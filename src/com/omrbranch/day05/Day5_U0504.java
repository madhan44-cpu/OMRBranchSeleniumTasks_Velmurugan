package com.omrbranch.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_U0504 {

	public static void t0504_login() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");

		WebElement txtcontctno = driver.findElement(By.xpath("//input[@id='inlineFormInputGroup']"));

		boolean enabled = txtcontctno.isEnabled();
		System.out.println(enabled);

		String domProperty = txtcontctno.getDomProperty("value");
		System.out.println(domProperty);

		if (enabled) {
			txtcontctno.sendKeys("976567788");

		} else {
			System.out.println("cntno Not found ");
		}
		driver.quit();
	}

	public static void main(String[] args) {
		t0504_login();

	}
}
