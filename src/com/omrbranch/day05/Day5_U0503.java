package com.omrbranch.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_U0503 {

	public static void t0503_login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement radiogender = driver.findElement(By.xpath("//input[@id='male']"));
		boolean enabled1 = radiogender.isEnabled();
		System.out.println("Enable: " + enabled1);
		boolean displayed1 = radiogender.isDisplayed();
		System.out.println(displayed1);
		radiogender.click();
		boolean selected1 = radiogender.isSelected();
		System.out.println(selected1);

		WebElement chkbxcricket = driver.findElement(By.xpath("//input[@id='checkbox-cricket']"));
		boolean enabled2 = chkbxcricket.isEnabled();
		System.out.println(enabled2);
		boolean displayed2 = chkbxcricket.isDisplayed();
		System.out.println(displayed2);
		chkbxcricket.click();
		boolean selected2 = chkbxcricket.isSelected();
		System.out.println(selected2);

		WebElement chkbxmovie = driver.findElement(By.xpath("//input[@id='checkbox-movie']"));
		boolean enabled3 = chkbxmovie.isEnabled();
		System.out.println(enabled3);
		boolean displayed3 = chkbxmovie.isDisplayed();
		System.out.println(displayed3);
		chkbxmovie.click();
		boolean selected3 = chkbxmovie.isSelected();
		System.out.println(selected3);

		WebElement chkbxhockey = driver.findElement(By.xpath("//input[@id='checkbox-hockey']"));
		boolean enabled4 = chkbxhockey.isEnabled();
		System.out.println(enabled4);
		boolean displayed4 = chkbxhockey.isDisplayed();
		System.out.println(displayed4);
		chkbxhockey.click();
		boolean selected4 = chkbxhockey.isSelected();
		System.out.println(selected4);

	}

	public static void main(String[] args) {
		t0503_login();

	}
}
