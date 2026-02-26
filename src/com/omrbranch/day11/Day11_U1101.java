package com.omrbranch.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day11_U1101 {
	public static void t1101_frame1() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to(" https://www.omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();

		driver.switchTo().frame("java-content");
		WebElement txtimage = driver.findElement(By.xpath("//h4[text()='Have Fun While You Learn']"));
		String text = txtimage.getText();
		System.out.println(text);
	}

	public static void t1102_frame2() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.id("java-content"));
		driver.switchTo().frame(element);

		WebElement txtimage = driver.findElement(By.xpath("//h4[text()='Have Fun While You Learn']"));
		String text = txtimage.getText();
		System.out.println(text);

		driver.switchTo().defaultContent();
		WebElement element2 = driver.findElement(By.xpath("//p[text()='We undertake ']"));
		String text2 = element2.getText();
		System.out.println(text2);
	}

	public static void main(String[] args) {
		t1101_frame1();
		t1102_frame2();
	}
}
