package com.omrbranch.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0207 {
	public static void t0207_openlogin() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icici.bank.in/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement btnok = driver.findElement(By.xpath("//button[@class='accept-button']"));
		btnok.click();
		
		WebElement element = driver.findElement(By.xpath("//div[@class='search-input-div']"));
		element.click();
		Thread.sleep(3000);
		WebElement srchbox = driver.findElement(By.xpath("//input[@class='input-content']"));
		srchbox.click();
		srchbox.sendKeys("Education loan");
		
		
//		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {

		t0207_openlogin();
	}
}
