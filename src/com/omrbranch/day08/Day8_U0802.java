package com.omrbranch.day08;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8_U0802 {

	public static void t0802_login() throws AWTException, InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);
		WebElement btnclik = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		action.contextClick(btnclik).perform();

		Thread.sleep(1000);
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);

		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);

		robot.keyPress(KeyEvent.VK_SLASH);
		robot.keyRelease(KeyEvent.VK_SLASH);

		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);

		robot.keyPress(KeyEvent.VK_SLASH);
		robot.keyRelease(KeyEvent.VK_SLASH);

		robot.keyPress(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
		robot.keyPress(KeyEvent.VK_4);
		robot.keyRelease(KeyEvent.VK_4);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);

		WebElement element = driver.findElement(By.xpath("//h6[@id='demo']"));
		element.click();

		String text = element.getText();
		System.out.println(text);

	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		t0802_login();
	}
}
