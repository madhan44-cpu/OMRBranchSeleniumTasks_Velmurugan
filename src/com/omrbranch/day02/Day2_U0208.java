package com.omrbranch.day02;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0208 {
	 public static void t0208_openlogin() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		WebElement txtfrom = driver.findElement(By.xpath("//input[@id='srcinput']"));
		 txtfrom.sendKeys("Bangalore");
		 Robot robot = new Robot();
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 
		 WebElement txtto = driver.findElement(By.xpath("//input[@id='destinput']"));
		 txtto.sendKeys("Chennai");
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyPress(KeyEvent.VK_DOWN);
		 robot.keyPress(KeyEvent.VK_ENTER);
		 robot.keyPress(KeyEvent.VK_ENTER);
	}
	 
	 public static void main(String[] args) throws AWTException {
	
		t0208_openlogin();
	}
}



