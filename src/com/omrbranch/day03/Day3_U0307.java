package com.omrbranch.day03;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day3_U0307 {
	public static void t0309_login() throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in");
		WebElement txtfrom = driver.findElement(By.id("srcinput"));
		txtfrom.sendKeys("Bangalore");
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);

		WebElement txtto = driver.findElement(By.id("destinput"));
		txtto.sendKeys("chennai");
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_DOWN);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);

		Thread.sleep(2000);

		WebElement btndate = driver
				.findElement(By.xpath("//button[@class='primaryButton___3262c2 searchButtonWrapper___567011 ']"));
		btndate.click();

	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		t0309_login();
	}

}
