package com.omrbranch.day08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day8_U0801 {

	public static void t0801_login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement btndisplay = driver.findElement(By.xpath("//button[text()='Double click to see future date']"));
		action.doubleClick(btndisplay).perform();
		Thread.sleep(5000);

		if (action == action) {
			System.out.println("diplayed future date");
		} else {
			System.out.println("not displayed");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		t0801_login();
	}
}
