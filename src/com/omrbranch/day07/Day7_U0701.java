

package com.omrbranch.day07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day7_U0701 {

	public static void t0701_login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		Actions actions = new Actions(driver);

		WebElement sstring = driver.findElement(By.xpath("//a[text()=' String ']"));
		WebElement d = driver.findElement(By.xpath("//li[@class='placeholder']"));

		actions.dragAndDrop(sstring, d).perform();

		WebElement sourceaction = driver.findElement(By.xpath("//a[text()=' Actions ']"));
		WebElement d2 = driver.findElement(By.xpath("//ol[@id='selenium-class']"));

		actions.dragAndDrop(sourceaction, d2).perform();
		WebElement sourcelist = driver.findElement(By.xpath("//a[text()=' List ']"));
		WebElement d3 = driver.findElement(By.xpath("//li[@class='placeholder']"));

		actions.dragAndDrop(sourcelist, d3).perform();

		WebElement sourceweb = driver.findElement(By.xpath("//li[@data-id='6']"));
		WebElement d4 = driver.findElement(By.id("selenium-interface"));

		actions.dragAndDrop(sourceweb, d4).perform();

		WebElement txtclick = driver.findElement(By.xpath("//a[text()='Succesfully Matched!']"));
		String text = txtclick.getText();
		System.out.println(text);
	}

	public static void main(String[] args) throws InterruptedException {
		t0701_login();

	}
}