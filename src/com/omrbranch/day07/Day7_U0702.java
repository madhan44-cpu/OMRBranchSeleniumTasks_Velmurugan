package com.omrbranch.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0702 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement courses = driver.findElement(By.xpath("//a[text()='Courses ']"));
     	action.moveToElement(courses).perform();

		WebElement clickselenium = driver.findElement(By.xpath("//a[text()='Selenium']"));
		clickselenium.click();

		WebElement txtusername = driver.findElement(By.xpath("//input[@id='email']"));
		txtusername.sendKeys("greenstechchennaiomr@gmail.com");

		WebElement txtpass = driver.findElement(By.xpath("//input[@id='pass']"));
		txtpass.sendKeys("Greens@123");

		WebElement btnlgn = driver.findElement(By.xpath("//button[@value='login']"));
		btnlgn.click();

		boolean selected = btnlgn.isSelected();
		System.out.println(selected);

		if (selected) {
			System.out.println("succesfull login");

		} else {
			System.out.println("not succefull login");
		}

		driver.quit();

	}
}
