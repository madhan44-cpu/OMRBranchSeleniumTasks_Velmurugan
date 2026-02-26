package com.omrbranch.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_U1301 {

	public static void t1301_login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement section2down = driver.findElement(By.xpath("//h4[text()='Section 2']"));
		js.executeScript("arguments[0].scrollIntoView(true);", section2down);

		WebElement clicktosee = driver.findElement(By.xpath("//button[text()='Click to see current date']"));
		boolean displayed = clicktosee.isDisplayed();
		System.out.println(displayed);
		if (displayed) {
			System.out.println("click to see current date is displayed");
		} else {
			System.out.println("click to see cuttent date is not displayed");
		}

		Thread.sleep(2000);
		WebElement section3 = driver.findElement(By.xpath("//h4[text()='Section 3']"));
		js.executeScript("arguments[0].scrollIntoView(true);", section3);

		WebElement performclick = driver.findElement(By.id("display-watch"));
		boolean displayed2 = performclick.isDisplayed();
		System.out.println(displayed2);

		if (displayed2) {
			System.out.println(" perform js click is Displayed");
		} else {
			System.out.println("Not displayed perform js click");
		}

	}

	public static void t1302_login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement section2down = driver.findElement(By.xpath("//h4[text()='Section 2']"));
		js.executeScript("arguments[0].scrollIntoView(true);", section2down);

		WebElement clicktosee = driver.findElement(By.xpath("//button[text()='Click to see current date']"));
		boolean displayed = clicktosee.isDisplayed();
		System.out.println(displayed);
		if (displayed) {
			System.out.println("click to see current date is displayed");
		} else {
			System.out.println("click to see cuttent date is not displayed");
		}

		Thread.sleep(2000);

		WebElement section1 = driver.findElement(By.xpath("//h4[text()='Section 1']"));
		js.executeScript("arguments[0].scrollIntoView(false)", section1);
		WebElement enumbtn = driver.findElement(By.xpath("//a[text()=' Enum ']"));

		boolean displayed2 = enumbtn.isDisplayed();
		System.out.println(displayed2);

		if (displayed2) {
			System.out.println("Enum btn is displayed");
		} else {
			System.out.println("Not enum btn is displayed");
		}

	}

	public static void main(String[] args) throws InterruptedException {
		 t1301_login();
		 t1302_login();
	}
}
