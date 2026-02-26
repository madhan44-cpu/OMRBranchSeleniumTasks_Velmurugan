package com.omrbranch.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0705 {
	public static void t0705_login() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.meesho.com/");
		driver.manage().window().maximize();
		Actions action = new Actions(driver);
		WebElement clkhomekitchen  = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		action.moveToElement(clkhomekitchen).perform();
		
		
		

	}
	
	
	
	public static void main(String[] args) {
		t0705_login();
	}
}
