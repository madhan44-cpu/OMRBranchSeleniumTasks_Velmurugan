package com.omrbranch.day04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_U0401 {
	public static void t0401_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/");
		WebElement txttitle = driver.findElement(By.xpath("//title[text()='Thoraipakkam OMR Branch']"));
		String heading = txttitle.getText();
		System.out.println(heading);

		WebElement txtname = driver.findElement(By.xpath("//a[@class='btn btn-contact']"));

		String name = txtname.getText();
		System.out.println(name);

		WebElement txtphno = driver.findElement(By.xpath("//span[@class='phone']"));

		String phno = txtphno.getText();

		System.out.println(phno);

	}

	public static void main(String[] args) {
		t0401_login();

	}
}
