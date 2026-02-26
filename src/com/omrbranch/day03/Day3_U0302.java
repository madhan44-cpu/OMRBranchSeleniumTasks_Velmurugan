package com.omrbranch.day03;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day3_U0302 {
	public static void t0303_login() {
		{
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
			WebElement btngntr = driver.findElement(By.xpath("//input[@id='male']"));
			btngntr.click();
			WebElement btncrk = driver.findElement(By.xpath("//input[@id='checkbox-cricket']"));
			btncrk.click();
			WebElement btnmvs = driver.findElement(By.xpath("//input[@id='checkbox-movie']"));
			btnmvs.click();
			WebElement btnhcy = driver.findElement(By.xpath("//input[@id='checkbox-hockey']"));
			btnhcy.click();
		}
	}
	public static void t0304_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		WebElement btngntr = driver.findElement(By.xpath("//input[@id='male']"));
		btngntr.click();
		WebElement btncrk = driver.findElement(By.xpath("//input[@id='checkbox-cricket']"));
		btncrk.click();
		WebElement btnmvs = driver.findElement(By.xpath("//input[@id='checkbox-movie']"));
		btnmvs.click();
		WebElement btnhcy = driver.findElement(By.xpath("//input[@id='checkbox-hockey']"));
		btnhcy.click();
		Thread.sleep(3000);
		
		driver.navigate().refresh();
	}
	public static void main(String[] args) throws InterruptedException {
		t0303_login();
		t0304_login();
	}
}
