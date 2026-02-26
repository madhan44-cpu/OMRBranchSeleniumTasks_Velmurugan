package com.omrbranch.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day12_U1202 {
	public static void t1202_login() {

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement automation = driver.findElement(By.xpath("//iframe[@src='https://www.omrbranch.com/public/html/automation.html']"));
		driver.switchTo().frame(1);

		WebElement headertxt = driver.findElement(By.xpath("//h2[text()='Automation']"));
		System.out.println(headertxt.getText());

		WebElement selenium = driver.findElement(By.id("selenium"));
		driver.switchTo().frame(selenium);

		WebElement selenium1 = driver.findElement(By.xpath("//h4[text()='Selenium']"));
		System.out.println(selenium1.getText());

		driver.switchTo().frame("actions");

		WebElement ttaction = driver.findElement(By.xpath("//p[text()='Actions']"));
		System.out.println(ttaction.getText());

		WebElement moveto = driver.findElement(By.xpath("//li[text()='Move to Ele']"));
		System.out.println(moveto.getText());
		WebElement clk = driver.findElement(By.xpath("//li[text()='Click']"));
		System.out.println(clk.getText());
		WebElement doubleclk = driver.findElement(By.xpath("//li[text()='Double Click']"));
		System.out.println(doubleclk.getText());
		WebElement rtclick = driver.findElement(By.xpath("//li[text()='Right Click']"));
		System.out.println(rtclick.getText());

		driver.switchTo().parentFrame();
		System.out.println(selenium1.getText());

		driver.switchTo().defaultContent();
		System.out.println("mainpage");

		WebElement paragraph = driver.findElement(By.xpath("//p[text()='We undertake ']"));
		System.out.println(paragraph.getText());

	}

	public static void main(String[] args) {
		t1202_login();
	}
}
