package com.omrbranch.day08;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8_U0804 {

	static void t0804_amazonWebLogin() throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.amazon.in/");
		driver.manage().window().maximize();

		WebElement btnclick = driver.findElement(By.xpath("//button[text()='Continue shopping']"));
		btnclick.click();

		Actions action = new Actions(driver);

		WebElement element = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		action.moveToElement(element).perform();
		Thread.sleep(3000);

		WebElement element2 = driver.findElement(By.xpath("//span[text()='Sign in']"));
		element2.click();

		WebElement element3 = driver.findElement(By.id("ap_email_login"));
		element3.sendKeys("9751697826", Keys.ENTER);
	}

	public static void main(String[] args) throws AWTException, InterruptedException {
		Day8_U0804.t0804_amazonWebLogin();
	}

}
