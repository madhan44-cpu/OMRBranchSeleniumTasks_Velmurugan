package com.omrbranch.day15;



	import java.time.Duration;
	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.ExpectedConditions;
	import org.openqa.selenium.support.ui.WebDriverWait;


public class Day1929393  {

	    public static void main(String[] args) {

	        // Launch browser
	        WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();

	        // Explicit Wait
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        // Navigate to URL
	        driver.get("http://greenstech.in/selenium-course-content.html");

	        // Scroll to "Framework Test Paper"
	        WebElement frameworkSection = driver.findElement(
	                By.xpath("//h2[contains(text(),'Framework Test Paper')]"));
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("arguments[0].scrollIntoView(true)", frameworkSection);

	  

	        // Click Junit link
	        WebElement junitLink = wait.until(ExpectedConditions.elementToBeClickable(
	                By.xpath("//a[text()='JUnit']")));
	        junitLink.click();

	        // Wait for questions to load
	        wait.until(ExpectedConditions.visibilityOfElementLocated(
	                By.xpath("//div[@id='collapseJunit']//li")));

	        // Locate all question contents
	        List<WebElement> questions = driver.findElements(
	                By.xpath("//div[@id='collapseJunit']//li"));

	        // Print questions
	        System.out.println("JUnit Framework Test Paper Questions:");
	        System.out.println("-------------------------------------");
	        for (WebElement question : questions) {
	            System.out.println(question.getText());
	        }

	        // Close browser
	        driver.quit();
	    }
	}


