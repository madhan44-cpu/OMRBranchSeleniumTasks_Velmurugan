package com.omrbranch.day09;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day9_U0902 {

	public static void t0902_login() {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement txtsrch = driver.findElement(By.xpath("//textarea[@name='q']"));
		txtsrch.sendKeys("Greens Technology OMR Branch");
		
		Actions action = new Actions(driver);
		
		action.keyDown(Keys.DOWN).keyUp(Keys.DOWN);
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();
		action.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		action.keyDown(Keys.ENTER).keyUp(Keys.ENTER).perform();

	}
	
	public static void main(String[] args) {
		t0902_login() ;
	} 
}
