// Changed something

package com.omrbranch.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1_U0101 {

	public static void t0101_login() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/");

		String pagetitle = driver.getTitle();
		System.out.println(pagetitle);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
		driver.quit();
	}

	public static void t0102_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://traininginomr.co.in/");

		String pagetitle2 = driver.getTitle();
		System.out.println(pagetitle2);

		String currentUrl2 = driver.getCurrentUrl();
		System.out.println(currentUrl2);
		driver.quit();

	}

	public static void t0103_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstech.in/");

		String pagetitle3 = driver.getTitle();
		System.out.println(pagetitle3);

		String currentUrl3 = driver.getCurrentUrl();
		System.out.println(currentUrl3);
		driver.quit();
	}

	public static void main(String[] args) {
		t0101_login();
		t0102_login();
		t0103_login();
	}
}
