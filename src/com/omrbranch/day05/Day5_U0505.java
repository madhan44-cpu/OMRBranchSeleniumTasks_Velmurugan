package com.omrbranch.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_U0505 {
	public static void t0505_login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com");
		driver.manage().window().maximize();
		WebElement rememberMe = driver.findElement(By.xpath("//input[@name='remember_me']"));
		rememberMe.click();

		boolean selected = rememberMe.isSelected();
		System.out.println(selected);

		String domProperty = rememberMe.getDomProperty("value");
		System.out.println(domProperty);

		if (selected) {
			System.out.println(" Remember Me checkbox is SELECTED");
		} else {
			System.out.println(" Remember Me checkbox is NOT selected");
		}
		driver.quit();

	}

	public static void main(String[] args) {
		t0505_login();

	}
}
