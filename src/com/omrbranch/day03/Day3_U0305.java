package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0305 {

	public static void t0307_login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		
		WebElement btndeclar = driver.findElement(By.xpath("//div[@class='pb-1 px-1 flex flex-middle nmx-1']"));
		btndeclar.click();
		
		WebElement txtfrom = driver.findElement(By.xpath("//input[@placeholder='Where from?']"));
		txtfrom.sendKeys("mumbai");
		WebElement btnclk1 = driver.findElement(By.xpath("//p[text()='Mumbai, IN - Chatrapati Shivaji Airport (BOM)']"));
		btnclk1.click();
		WebElement txtto = driver.findElement(By.xpath("//input[@placeholder='Where to?']"));
		txtto.sendKeys("chennai");
		Thread.sleep(2000);
		
		
		
		WebElement btnclk2 = driver.findElement(By.xpath("//p[text()='Chennai, IN - Chennai Airport (MAA)']"));
		btnclk2.click();
         
         
         
		WebElement btnsearch = driver.findElement(By.xpath("//h4[text()='Search flights']"));
		
		btnsearch.click();
	}

	public static void main(String[] args) throws InterruptedException {
		t0307_login();
	}

}
