package com.omrbranch.day17;

import java.util.Map;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import net.bytebuddy.asm.Advice.Enter;

public class Employee {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		@Nullable
		String title = driver.getTitle();
		System.out.println(title);
		@Nullable
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		// current window close
		driver.close();

		// quit the driver
		driver.quit();
		// find locator ID
		WebElement id = driver.findElement(By.id("Atribute value"));
		System.out.println(id);

		// find locator NAME
		WebElement name = driver.findElement(By.name("attribute value"));
		System.out.println(name);

		// find locator class

		WebElement class1 = driver.findElement(By.className("attribtejvalue"));
		System.out.println(class1);

		// send locator textbox
		WebElement txtbox = driver.findElement(By.id("Attributevalue"));
		txtbox.sendKeys("hfnhgfhfgfgthdomr",Keys.ENTER);
		txtbox.clear();
		

		// click tn
		txtbox(element).click();

		// is displayed
		
		WebElement txtbox2 = driver.findElement(By.id("Attributevalue"));
		
		boolean display = txtbox.isDisplayed();
		System.out.println(display);
		
		
		
		
		txtbox.isEnabled();
		txtbox.isSelected();

		// clear the textr box

		txtbox.clear();

		// insert value and press enter

		WebElement txt = driver.findElement(By.id("currentUrl"));
		txt.sendKeys("kk", Keys.ENTER);

		// getdompropertty used for insert value get the print

		String text = txt.getDomProperty("value");
		System.out.println(text);

		
		//dropdown method visibleText(
		WebElement element = driver.findElement(By.xpath("//option[contains(text(),'Tamil Nadu')]"));

		Select slect = new Select(element);
		slect.selectByVisibleText("Tamil Nadu");
		
		
		

	}
}
