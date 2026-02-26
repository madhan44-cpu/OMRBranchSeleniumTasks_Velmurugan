package com.omrbranch.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0703 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();

		//Actions action = new Actions(driver);
		WebElement clickshop = driver.findElement(By.xpath("	//button[text()='Continue shopping']"));
		clickshop.click();

		WebElement clickprime = driver.findElement(By.xpath("//span[text()='Prime']"));
	//	action.moveToElement(clickprime).perform();
		clickprime.click();

		Thread.sleep(3000);

		WebElement joinprime = driver.findElement(By.xpath("//a[text()='Join Prime']"));
		joinprime.click();
		
		String title = driver.getTitle();
		System.out.println(title);
	}
}
