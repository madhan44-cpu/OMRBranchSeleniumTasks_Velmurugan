package com.omrbranch.day04;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_U0402 {
	public static void t0402_login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement txtdtme = driver.findElement(By.xpath("//h2[contains(text(),'Register -')]"));
		String title = txtdtme.getText();
		System.out.println(title);

	}

	public static void main(String[] args) {

		t0402_login();
	}
}
