package com.omrbranch.day10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Day10_U1005 {
	public static void t1011_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement ddlskills = driver.findElement(By.id("skills"));
		Select selectmultiple = new Select(ddlskills);

		boolean multiple = selectmultiple.isMultiple();

		if (multiple) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	public static void t1012_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement ddlskills = driver.findElement(By.id("skills"));
		Select selectall = new Select(ddlskills);
		selectall.selectByValue("Java");
		selectall.selectByValue("Javascript");

		List<WebElement> allSelectedOptions = selectall.getAllSelectedOptions();

		for (WebElement option : allSelectedOptions) {
			String text = option.getText();
			System.out.println(text);

		}
	}

	public static void t1013_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement ddlskills = driver.findElement(By.id("skills"));
		Select select = new Select(ddlskills);

		List<WebElement> options = select.getOptions();

		for (int i = 0; i < options.size(); i++) {
			select.selectByIndex(i);
			WebElement element = options.get(i);
			String domProperty = element.getDomProperty("value");
			System.out.println(domProperty);
		}

	}

	public static void t1014_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement ddlskills = driver.findElement(By.id("skills"));
		Select selectskills = new Select(ddlskills);
		selectskills.selectByValue("Java");
		selectskills.selectByValue("Javascript");
		selectskills.selectByValue("Python");

		selectskills.deselectAll();

	}

	public static void t1015_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement ddlskills = driver.findElement(By.id("skills"));

		Select select = new Select(ddlskills);

		select.selectByValue("Java");
		select.selectByValue("Javascript");
		select.selectByValue("Python");

		Thread.sleep(5000);

		select.deselectByValue("Python");
		select.deselectByVisibleText("Javascript");
		select.deselectByIndex(38);

		List<WebElement> alloptions = select.getOptions();
		for (WebElement webElement : alloptions) {
			String text = webElement.getText();
			System.out.println(text);

		}
	}

	public static void t1016_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement ddlskills = driver.findElement(By.id("skills"));
		ddlskills.sendKeys("Java");
		WebElement ddlcountry = driver.findElement(By.id("country-list"));
		ddlcountry.sendKeys("india");

	}

	public static void main(String[] args) throws InterruptedException {
		t1011_login();
		t1012_login();
		t1013_login();
		t1014_login();
		t1015_login();
		t1016_login();
	}
}