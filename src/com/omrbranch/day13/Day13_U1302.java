package com.omrbranch.day13;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day13_U1302 {
public static void t1302_login() {
	
	
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("https://www.omrbranch.com/javatraininginchennaiomr");
    driver.manage().window().maximize();
    
    
    JavascriptExecutor js = (JavascriptExecutor)driver;
    WebElement down = driver.findElement(By.xpath("//span[text()='For Joining Automation Course']"));
    js.executeScript("arguments[0].scrollIntoView(true);",down);
    String text = down.getText();
    System.out.println(text);
    
    WebElement phno = driver.findElement(By.xpath("//a[text()='99441 52058']"));
    String text2 = phno.getText();
    System.out.println(text2);
    
    
    WebElement txtpara = driver.findElement(By.xpath("//p[text()='We undertake ']"));
    js.executeScript("arguments[0].scrollIntoView(false);", txtpara);
    String text3 = txtpara.getText();
    System.out.println(text3);
    
}
public static void main(String[] args) {
	 t1302_login();
}
}
