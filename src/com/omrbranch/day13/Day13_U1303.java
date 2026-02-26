package com.omrbranch.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_U1303 {
	public static void t1304_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement down = driver.findElement(By.xpath("//h4[text()='Section 3']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);

		WebElement txtperform = driver.findElement(By.id("display-watch"));
		js.executeScript("arguments[0].click()", txtperform);

		WebElement clockdisplay = driver.findElement(By.id("image"));
		boolean displayed = clockdisplay.isDisplayed();
		System.out.println(displayed);

	}

	public static void t1305_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement down = driver.findElement(By.xpath("//h4[text()='Section 3']"));
		js.executeScript("arguments[0].scrollIntoView(true)", down);

		WebElement contfield = driver.findElement(By.xpath("//h5[text()='Perform js click to enable contact field']"));
		js.executeScript("arguments[0].click()", contfield);

		Thread.sleep(5000);
		WebElement txtcontact = driver.findElement(By.id("inlineFormInputGroup"));
		js.executeScript("arguments[0].setAttribute('value','99441 52058')", txtcontact);

	}

	public static void main(String[] args) throws InterruptedException {

		t1304_login();
		t1305_login();
	}
}
