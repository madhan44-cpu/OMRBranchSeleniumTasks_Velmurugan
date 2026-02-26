
package com.omrbranch.day09;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day9_U0903 {

	public static void t0903_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement clckdate = driver.findElement(By.xpath("//button[text()='Click to see current date']"));
		clckdate.click();

		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		alert.accept();

		WebElement txtprint = driver.findElement(By.id("display"));
		String currentdate = txtprint.getText();
		System.out.println(currentdate);

		driver.quit();
	}

	public static void t0904_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement clckdate = driver.findElement(By.xpath("//button[text()='Double click to see future date']"));
		Actions action = new Actions(driver);
		action.doubleClick(clckdate).perform();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		WebElement txtcancel = driver.findElement(By.xpath("//h6[text()='Wooh! You Pressed Cancel!']"));
		String futuredte = txtcancel.getText();
		System.out.println(futuredte);
	}

	public static void t0905_login() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();
		WebElement pstdate = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		Actions action = new Actions(driver);
		
		action.contextClick(pstdate).perform();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("11/10/2004");
		alert.accept();
		
		WebElement txtpast = driver	.findElement(By.xpath("//h6[text()='You entered 11/10/2004as past date and pressed OK!']"));
		String pastedte = txtpast.getText();
		System.out.println(pastedte);
	}

	public static void main(String[] args) throws InterruptedException {
		t0903_login();
		t0904_login();
		t0905_login();
	}
}
