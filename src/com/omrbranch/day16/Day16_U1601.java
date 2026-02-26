package com.omrbranch.day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Day16_U1601 {

	public static void t1601_login() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.omrbranch.com/");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		WebElement loginbtn = driver.findElement(By.xpath("(//a[@type='text'])[2]"));
		loginbtn.click();

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		WebElement txtname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("first_name")));
		txtname.sendKeys("OMR Branch");
		WebElement cname = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("last_name")));
		cname.sendKeys("OMR Branch");

		WebElement txtemail = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signupEmail")));
		txtemail.sendKeys("greenstechchennaiomr@gmail.com");

		WebElement txtmobilno = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signupMobile")));
		txtmobilno.sendKeys("9753929020");

		WebElement txtpassword = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("signup_password")));
		txtpassword.sendKeys("Greens@123");

		WebElement txtcpass = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("signup_pwd")));
		txtcpass.sendKeys("Greens@123");

		WebElement txtday = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("day")));
		txtday.sendKeys("11");
		WebElement txtmonth = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("month")));
		txtmonth.sendKeys("october");
		WebElement txtyear = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("year")));
		txtyear.sendKeys("2004");
		WebElement clkhobby = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("photography")));
		clkhobby.click();
		WebElement clksignup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sub_button")));
		clksignup.click();

	}

	public static void main(String[] args) {
		t1601_login();
	}

}
