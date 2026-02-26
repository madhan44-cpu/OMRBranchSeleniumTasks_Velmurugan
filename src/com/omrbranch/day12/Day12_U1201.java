package com.omrbranch.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_U1201 {

	public static void t1201_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement automation = driver
				.findElement(By.xpath("//iframe[@src='https://www.omrbranch.com/public/html/automation.html']"));
		driver.switchTo().frame(1);

		WebElement headertxt = driver.findElement(By.xpath("//h2[text()='Automation']"));
		System.out.println(headertxt.getText());

		WebElement corejava = driver.findElement(By.id("core-java"));
		driver.switchTo().frame(0);

		WebElement corejava1 = driver.findElement(By.xpath("//h4[text()='Core Java']"));
		System.out.println(corejava1.getText());

		driver.switchTo().frame("oops");

		WebElement ttoops = driver.findElement(By.xpath("//p[text()='1.1 OOPS']"));
		System.out.println(ttoops.getText());

		WebElement inheritance = driver.findElement(By.xpath("//li[text()='Inheritance']"));
		System.out.println(inheritance.getText());
		WebElement abstraction = driver.findElement(By.xpath("//li[text()='Abstraction']"));
		System.out.println(abstraction.getText());
		WebElement polymorphisym = driver.findElement(By.xpath("//li[text()='Polymorphism']"));
		System.out.println(polymorphisym.getText());
		WebElement encapsulation = driver.findElement(By.xpath("//li[text()='Encapsulation']"));
		System.out.println(encapsulation.getText());

		driver.switchTo().parentFrame();
		System.out.println(corejava1.getText());

		WebElement collection = driver.findElement(By.id("collections"));
		driver.switchTo().frame(collection);

		WebElement collectiontxt = driver.findElement(By.xpath("//p[text()='1.2 Collections']"));
		System.out.println(collectiontxt.getText());

		WebElement list = driver.findElement(By.xpath("//li[text()='List']"));
		System.out.println(list.getText());
		WebElement set = driver.findElement(By.xpath("//li[text()='Set']"));
		System.out.println(set.getText());
		WebElement map = driver.findElement(By.xpath("//li[text()='Map']"));
		System.out.println(map.getText());

		driver.switchTo().parentFrame();
		System.out.println(collection.getText());

		driver.switchTo().parentFrame();
		System.out.println(corejava.getText());

	}

	public static void main(String[] args) {
		t1201_login();
	}
}
