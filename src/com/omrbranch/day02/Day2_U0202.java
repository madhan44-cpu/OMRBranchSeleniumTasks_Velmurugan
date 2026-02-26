package com.omrbranch.day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_U0202 {
	private void  t0202_openlogin() {
		 WebDriver driver = new ChromeDriver();

		 driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		 driver.manage().window().maximize();
		 WebElement textUsername = driver.findElement(By.id("first_name"));
		 textUsername.sendKeys("Greenstech");
		 WebElement txtlastname = driver.findElement(By.id("last_name"));
		 txtlastname .sendKeys("OMR");
		 WebElement txtAddress = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		 txtAddress.sendKeys("ICICI Bank Upstairs,Balamurugan Garden,plot no. 19,Landmark; oposite Sangeetha hotel,okkiyam,Chennai Tamil Nadu 600097");
		 WebElement txtemail = driver.findElement(By.id("email"));
		 txtemail.sendKeys("greentecChennai@gmail.com");
		 WebElement txtPassword = driver.findElement(By.id("password"));
		 txtPassword.sendKeys("Green@123");
		 WebElement txtCPassword = driver.findElement(By.id("confirm-password"));
		 txtCPassword.sendKeys("Greens@123");	
		 
		 driver.quit();
	}
	
	public static void main(String[] args) {
		 Day2_U0202 a = new  Day2_U0202();
		 a.t0202_openlogin();
		 
	}
}
