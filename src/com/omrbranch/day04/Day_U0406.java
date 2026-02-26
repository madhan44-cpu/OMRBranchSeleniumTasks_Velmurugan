package com.omrbranch.day04;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_U0406 {
	public static void t0406_login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement txtprgh = driver.findElement(By.xpath("//h1[@class='font12 m-0']"));
		@Nullable
		String title = txtprgh.getText();
		System.out.println(title);
	}

	public static void main(String[] args) {
		t0406_login();
	}
}