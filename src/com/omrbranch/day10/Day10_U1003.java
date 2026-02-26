package com.omrbranch.day10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10_U1003 {

	private static void t1007_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement ddlday = driver.findElement(By.id("days"));
		Select select = new Select(ddlday);
		WebElement day = select.getFirstSelectedOption();
		String text2 = day.getText();
		System.out.println(text2);

		WebElement btnmonth = driver.findElement(By.id("months"));
		Select selectmonth = new Select(btnmonth);
		WebElement firstSelectedOption = selectmonth.getFirstSelectedOption();
		String text3 = firstSelectedOption.getText();
		System.out.println(text3);

		WebElement btndob = driver.findElement(By.id("dob"));
		Select selectyear = new Select(btndob);
		WebElement firstSelectedOption2 = selectyear.getFirstSelectedOption();
		String text = firstSelectedOption2.getText();
		System.out.println(text);

		if (text2.equals("day") && (text3.equals("month")) && (text.equals("year"))) {

			System.out.println("same");
		}
	}

	private static void t1008_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement ddlday = driver.findElement(By.id("country-list"));
		Select select = new Select(ddlday);
		select.selectByVisibleText("India");
		WebElement ddlcountry = driver.findElement(By.id("country-list"));
		Select select1 = new Select(ddlcountry);
		WebElement firstSelectedOption = select1.getFirstSelectedOption();
		String text1 = firstSelectedOption.getText();
		System.out.println(text1);

		if (ddlday == ddlcountry) {

			System.out.println("same");
		} else {
			System.out.println("not same ");
		}

	}

	private static void t1009_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement dropdowncountry = driver.findElement(By.xpath("country-list"));
		Select select = new Select(dropdowncountry);
		select.selectByValue("IN");

	}

	public static void main(String[] args) throws InterruptedException {
		t1007_login();
		t1008_login();
		// t1009_login();

	}
}
