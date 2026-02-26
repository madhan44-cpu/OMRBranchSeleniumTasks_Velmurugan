package com.omrbranch.day04;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_U0404 {
	public static void t0404_login() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement txtprgh = driver.findElement(By.xpath("//h4[@class='section-heading mb-5']"));
		@Nullable
		String title = txtprgh.getText();
		System.out.println(title);

	}

	public static void main(String[] args) {
		t0404_login();
	}
}
