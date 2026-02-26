package com.omrbranch.day04;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_U0407 {

	public static void t0407_login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://traininginomr.co.in/");
		driver.manage().window().maximize();
		WebElement txtprgh = driver.findElement(By.xpath("//p[text()='19, Balamurugan Garden,']"));
		@Nullable
		String title = txtprgh.getText();
		System.out.println(title);
		WebElement txtnme = driver.findElement(By.xpath(
				"//p[text()='3/178, Rajiv Gandhi Salai, Mettukuppam, Chennai, Thoraipakkam, Tamil Nadu 600097']"));
		@Nullable
		String title1 = txtnme.getText();
		System.out.println(title1);
		WebElement txtphno = driver.findElement(By.xpath("//span[text()='91- 89399 82288']"));
		@Nullable
		String title2 = txtphno.getText();
		System.out.println(title2);
	}

	public static void main(String[] args) {

		t0407_login();
	}
}
