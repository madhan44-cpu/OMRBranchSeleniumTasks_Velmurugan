package com.omrbranch.day03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0310 {

	public static void t0312_login()

	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/register");
		WebElement txtbar = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		txtbar.sendKeys("9751697826");
		
		
		WebElement element = driver.findElement(By.xpath("//input[@type='checkbox']"));
		element.click();
		
		WebElement element2 = driver.findElement(By.xpath("	//div[text()='CONTINUE']"));
		element2.click();
	}

	public static void main(String[] args) {
		t0312_login();

	}
}
