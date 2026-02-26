package com.omrbranch.day15;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day15_U1501 {

	public static void t1501_login() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://greenstech.in/selenium-course-content.html");

		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement btnframetext = driver.findElement(By.id("heading304"));
		js.executeScript("arguments[0].scrollIntoView(true)", btnframetext);
		
		js.executeScript("arguments[0].click()", btnframetext);


		WebElement clkJUIT = driver.findElement(By.xpath("//a[text()=' JUNIT']"));
		js.executeScript("arguments[0].click()", clkJUIT);
	
	//	 List<WebElement> elements = driver	.findElements(By.xpath("//a[text()=' JUNIT']"));
		 
		  List<WebElement> questions = driver.findElements(
	                By.xpath("//div[@id='collapseJunit']//li"));

	        // Print questions
	        System.out.println("JUnit Framework Test Paper Questions:");
	        System.out.println("-------------------------------------");
	        for (WebElement question : questions) {
	            System.out.println(question.getText());
	            
	        }
	        }
		 
//		 for (WebElement webElement : elements) {
//			System.out.println(webElement.getText());
//		}
//	}

	public static void main(String[] args) {
		t1501_login();
	}
}
