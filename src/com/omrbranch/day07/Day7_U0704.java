package com.omrbranch.day07;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0704 {

	public static void t0704_login() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement clkfashion = driver.findElement(By.xpath("//span[text()='Fashion']"));
		action.moveToElement(clkfashion).perform();

		WebElement clkkids = driver.findElement(By.xpath("//a[text()='Kids']"));
		clkkids.click();

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String mensUrl = "https://www.flipkart.com/clothing-and-accessories/topwear/tshirt/men-tshirt/pr?sid=clo,ash,ank,edy&otracker=categorytree&otracker=nmenu_sub_Men_0_T-Shirts";

		if (currentUrl != mensUrl) {
			System.out.println("no redirecting");

		} else {
			System.out.println("redirecting");
		}
		driver.quit();
	}

	public static void main(String[] args) {
		t0704_login();
	}
}
