package com.omrbranch.day17;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day17_U1701 {
	public static void t1701_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/write-xpath-table.html");

		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> rows = driver.findElements(By.tagName("tr"));

		for (int i = 0; i < rows.size(); i++) {
			WebElement allrows = rows.get(i);
			String text = allrows.getText();
			System.out.println(text);
		}
	}

	public static void t1702_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/write-xpath-table.html");

		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		WebElement firstrows = driver.findElement(By.xpath("//tr[1]"));

		String text = firstrows.getText();
		System.out.println(text);

	}

	public static void t1703_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.guru99.com/test/write-xpath-table.html");

		WebElement table = driver.findElement(By.xpath("//table[@border='l']"));
		List<WebElement> allrowscount = driver.findElements(By.tagName("tr"));

		int rowCount = allrowscount.size();
		System.out.println(rowCount);

	}

	public static void t1704_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/table/");

		WebElement table = driver.findElement(By
				.xpath("//table[@ class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']"));
		List<WebElement> allrows = driver.findElements(By.tagName("tr"));
		for (int i = 0; i < allrows.size(); i++) {
			WebElement allrowscolumn = allrows.get(i);
			String text = allrowscolumn.getText();
			System.out.println(text);
		}
	}

	public static void t1705_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://letcode.in/table/");

		WebElement table = driver.findElement(By
				.xpath("//table[@ class='mat-sort table is-bordered is-striped is-narrow is-hoverable is-fullwidth']"));
		List<WebElement> allrows = table.findElements(By.tagName("tr"));
		for (int i = 0; i < allrows.size(); i++) {

			if (i % 2 == 0) {
				WebElement allrowscolumn = allrows.get(i);
				String text = allrowscolumn.getText();
				System.out.println(text);
			}
		}
	}

	public static void main(String[] args) {
//		t1701_login();
//		t1702_login();
//		t1703_login();
t1704_login();
	//	t1705_login();
	}
}
