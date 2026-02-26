package com.omrbranch.day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_U0601 {
	public static void t0601_login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/");
		WebElement signup = driver.findElement(By.xpath("//a[@class='signupanchor showSignup']"));
		signup.click();

         Thread.sleep(5000);
		WebElement txtf1name = driver.findElement(By.xpath("//input[@name='first_name']"));
		txtf1name.sendKeys("GreensTech");
        
		WebElement txtlastname = driver.findElement(By.xpath("//input[@name='last_name']"));
		txtlastname.sendKeys("OMR branch");

		WebElement txtemail = driver.findElement(By.xpath("//input[@name='signup_email']"));
		txtemail.sendKeys("greenstechchennaiomr@gmail.com");

		WebElement txtmobilenmbr = driver.findElement(By.xpath("//input[@name='mobile_number']"));
		txtmobilenmbr.sendKeys("99441 52058");

		WebElement txtpassword = driver.findElement(By.xpath("//input[@name='signup_password']"));
		txtpassword.sendKeys("Greens@123");

		WebElement txtcpassword = driver.findElement(By.xpath("//input[@name='confirm_password']"));
		txtcpassword.sendKeys("Greens@123");

		WebElement txtDOBday = driver.findElement(By.xpath("//select[@name='day']"));
		txtDOBday.sendKeys("11");

		WebElement btnDOBmonth = driver.findElement(By.xpath("//select[@name='month']"));
		btnDOBmonth.sendKeys("october");

		Thread.sleep(2000);

		WebElement txtDOByear = driver.findElement(By.xpath("//select[@name='year']"));
		txtDOByear.sendKeys("2004");

		WebElement btndance = driver.findElement(By.xpath("//input[@name='hobbies[]']"));
		btndance.click();

	}

	public static void main(String[] args) throws InterruptedException {
		t0601_login();
	}
}
