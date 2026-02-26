
package com.omrbranch.day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10_U1002 {

	public static void t1003_login() throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		WebElement btnsign = driver.findElement(By.xpath("(//a[@data-toggle='modal'])[2]"));
		btnsign.click();
		Thread.sleep(5000);

		WebElement ddlmonth = driver.findElement(By.xpath("//select[@name='month']"));
		Select selectmonth = new Select(ddlmonth);

		List<WebElement> allmonth = selectmonth.getOptions();

		for (int i = 1; i < allmonth.size(); i++) {

			if (i % 2 != 0) {
				WebElement element = allmonth.get(i);
				String text1 = element.getText();
				System.out.println(text1);
			}

		}

	}

	private static void t1004_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("(//a[@data-toggle='modal'])[2]"));
		element.click();
		Thread.sleep(5000);

		WebElement ddlmonth = driver.findElement(By.xpath("//select[@name='month']"));

		Select selectmonth = new Select(ddlmonth);
		List<WebElement> evenmonth = selectmonth.getOptions();

		for (int i = 0; i < evenmonth.size(); i++) {

			if (i % 2 == 0) {

				WebElement even = evenmonth.get(i);
				String text = even.getText();
				System.out.println(text);
			}
		}
	}

	private static void t1005_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("");
		driver.manage().window().maximize();

		WebElement clksign = driver.findElement(By.xpath("//a[@data-toggle='modal'])[2]\""));
		clksign.click();

		Thread.sleep(5000);

		WebElement ddltmonth = driver.findElement(By.xpath("//select[@name='month']"));
		Select selectmonth = new Select(ddltmonth);

		List<WebElement> primemonth = selectmonth.getOptions();
		for (int i = 0; i < primemonth.size(); i++) {

		}

	}

	private static void t1006_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		WebElement element = driver.findElement(By.xpath("(//a[@data-toggle='modal'])[2]"));
		element.click();
		Thread.sleep(5000);

		WebElement btnyear = driver.findElement(By.name("year"));
		Select select = new Select(btnyear);

		List<WebElement> year = select.getOptions();

		for (int i = 0; i < year.size(); i++) {

			WebElement webElement = year.get(i);
			String text = webElement.getText();

			System.out.println(text);

		}
	}

	public static void main(String[] args) throws InterruptedException {

		//t1003_login();
		t1004_login();
		// t1005_login();
		t1006_login();
	}
}
