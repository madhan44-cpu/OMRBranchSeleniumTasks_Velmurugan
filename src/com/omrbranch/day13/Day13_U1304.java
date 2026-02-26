package com.omrbranch.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_U1304 {
	public static void t1306_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement txtusername = driver.findElement(By.id("email"));
		js.executeScript("arguments[0].setAttribute('value','9944152058@omrbranch.com')", txtusername);
		WebElement txtpass = driver.findElement(By.id("pass"));
		js.executeScript("arguments[0].setAttribute('value','9944152058')", txtpass);

		WebElement lgnbtn = driver.findElement(By.xpath("//button[text()='Login']"));
		js.executeScript("arguments[0].click()", lgnbtn);

		Thread.sleep(3000);
		WebElement userprnt = driver.findElement(By.xpath("//b[text()='User does not exist']"));
		String text = userprnt.getText();
		System.out.println(text);
		
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		t1306_login();
	}
}
