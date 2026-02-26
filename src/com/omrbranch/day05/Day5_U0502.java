package com.omrbranch.day05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day5_U0502 {
	public static void t0502_login() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		WebElement txtnme = driver.findElement(By.xpath("//input[@id='first_name']"));
		txtnme.sendKeys("GreensTech");
		String value = txtnme.getDomProperty("value");
		System.out.println(value);
		WebElement txtlstname = driver.findElement(By.xpath("//input[@id='last_name']"));
		txtlstname.sendKeys("OMR");
		String value2 = txtlstname.getDomProperty("value");
		System.out.println(value2);
		WebElement txtphno = driver.findElement(By.xpath("//input[@id='phone']"));
		txtphno.sendKeys("9944152058");
		String value3 = txtphno.getDomProperty("value");
		System.out.println(value3);
		WebElement txtmail = driver.findElement(By.xpath("//input[@id='email']"));
		txtmail.sendKeys("greenstechchennaiomr@gmail.com");
		String value4 = txtmail.getDomProperty("value");
		System.out.println(value4);
		WebElement txtaddres = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		txtaddres.sendKeys(
				"ICICI Bank Upstairs, Balamurugan Garden, Plot No.19, Landmark:, opposite to Sangeetha hotel");
		String value5 = txtaddres.getDomProperty("value");
		System.out.println(value5);
		WebElement txtpassword = driver.findElement(By.xpath("//input[@id='password']"));
		txtpassword.sendKeys("Greens@123");
		String value6 = txtpassword.getDomProperty("value");
		System.out.println(value6);
		WebElement txtcpassword = driver.findElement(By.xpath("//input[@id='confirm-password']"));
		txtcpassword.sendKeys("Greens@123");
		String value7 = txtcpassword.getDomProperty("value");
		System.out.println(value7);
	}

	public static void main(String[] args) {
		t0502_login();
	}
}
