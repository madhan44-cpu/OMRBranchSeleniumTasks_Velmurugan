
package com.omrbranch.day10;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10_U1001 {

	public static void t1001_login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		WebElement btnsign = driver.findElement(By.xpath("(//a[@data-toggle='modal'])[2]"));
		btnsign.click();
		Thread.sleep(5000);

		WebElement ddlday = driver.findElement(By.name("day"));
		Select selectday = new Select(ddlday);
		selectday.selectByIndex(3);

		Thread.sleep(2000);

		WebElement ddlmonth = driver.findElement(By.name("month"));
		Select selectmonth = new Select(ddlmonth);
		selectmonth.selectByValue("March");

		WebElement ddlyear = driver.findElement(By.name("year"));
		Select selectyear = new Select(ddlyear);
		selectyear.selectByVisibleText("1990");
		driver.quit();
	}

	public static void t1002_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		WebElement btnsign = driver.findElement(By.xpath("(//a[@data-toggle='modal'])[2]"));
		btnsign.click();
		Thread.sleep(5000);
		WebElement ddlmonth = driver.findElement(By.name("month"));
		Select selectmonth = new Select(ddlmonth);
		List<WebElement> options = selectmonth.getOptions();
		{
			for (int i = 1; i < options.size(); i++) {

				WebElement webElement = options.get(i);
				String text = webElement.getText();
				System.out.println(text);
			}
		}
	}

	public static void main(String[] args) throws InterruptedException {
		//t1001_login();
		t1002_login();
	}
}
