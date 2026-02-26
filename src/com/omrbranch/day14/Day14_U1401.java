package com.omrbranch.day14;

import java.awt.Desktop.Action;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Day14_U1401 {
	public static void t1401_login() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.navigate().to("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		WebElement txtusername = driver.findElement(By.id("email"));
		txtusername.sendKeys("9944152058@omrbranch.com");

		WebElement txtpassword = driver.findElement(By.id("pass"));
		txtpassword.sendKeys("9944152058");

		WebElement element = driver.findElement(By.xpath("//button[text()='Login']"));
		element.click();
		Thread.sleep(2000);
		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File src = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(src);

		File dest = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\OMRBranchSeleniumTasks_Velmurugan//library//omr.png1");
		FileUtils.copyFile(src, dest);

	}

	public static void t1402_login() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/javatraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement txtpara = driver.findElement(By.xpath("//div[@class='boxContent']"));

		File screenshotpara = txtpara.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotpara);

		File dest = new File(
				"C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\OMRBranchSeleniumTasks_Velmurugan//library//omr2.png");

		FileUtils.copyFile(screenshotpara, dest);

	}

	public static void t1403_login() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/seleniumtraininginchennaiomr");
		driver.manage().window().maximize();

		Actions action = new Actions(driver);

		WebElement src = driver.findElement(By.xpath("//a[text()=' Actions ']"));

		WebElement dir = driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
		action.dragAndDrop(src, dir).perform();

		WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement dir2 = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		action.dragAndDrop(src2, dir2).perform();

		Thread.sleep(2000);

		WebElement src3 = driver.findElement(By.xpath("//a[text()=' List ']"));
		WebElement dir3 = driver.findElement(By.id("java-interface"));
		action.dragAndDrop(src3, dir3).perform();

		WebElement src4 = driver.findElement(By.xpath("//li[@class='block15 ui-draggable ui-draggable-handle']"));
		WebElement dir4 = driver.findElement(By.id("selenium-interface"));
		action.dragAndDrop(src4, dir4).perform();

		Thread.sleep(2000);

		TakesScreenshot screenshot = (TakesScreenshot) driver;

		File omrscreenshots = screenshot.getScreenshotAs(OutputType.FILE);
		System.out.println(omrscreenshots);

		File dest = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\OMRBranchSeleniumTasks_Velmurugan\\library\\omr3.png");

		FileUtils.copyFile(omrscreenshots, dest);

	}

	public static void t1404_login() throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/apitestingtraininginchennaiomr");
		driver.manage().window().maximize();

		WebElement txtname = driver.findElement(By.id("first_name"));
		txtname.sendKeys("Greens Tech");

		WebElement cname = driver.findElement(By.id("last_name"));
		cname.sendKeys("Greens Tech");
		WebElement txtaddress = driver.findElement(By.xpath("//textarea[@class='form-control address']"));
		txtaddress.sendKeys(
				" 3/178, Second Floor, Rajiv Gandhi Salai, Mettukuppam, Chennai, Thoraipakkam, Tamil Nadu 600097");
		WebElement email = driver.findElement(By.id("email"));
		email.sendKeys("velmurugan@omrbranch.com");
		WebElement phno = driver.findElement(By.id("phone"));
		phno.sendKeys("99441 52058");
		WebElement password = driver.findElement(By.id("confirm-password"));
		password.sendKeys("Greens@123");
		WebElement cpassword = driver.findElement(By.id("password"));
		cpassword.sendKeys("Greens@123");

		WebElement radiobtn = driver.findElement(By.id("male"));
		radiobtn.click();

		WebElement chkbox1 = driver.findElement(By.id("checkbox-cricket"));
		chkbox1.click();

		WebElement chkbox2 = driver.findElement(By.id("checkbox-movie"));
		chkbox2.click();

		WebElement chkbox3 = driver.findElement(By.id("checkbox-hockey"));
		chkbox3.click();

		WebElement textlanugae = driver.findElement(By.xpath("//textarea[@class='select2-search__field']"));
		textlanugae.click();
		WebElement textEnglish = driver.findElement(By.xpath("//li[text()='English']"));
		textEnglish.click();
		WebElement textItanlian = driver.findElement(By.xpath("//li[text()='Italian']"));
		textItanlian.click();
		WebElement textjava = driver.findElement(By.xpath("//option[text()='Javascript']"));
		textjava.click();

		WebElement textname = driver.findElement(By.xpath("//option[text()='India']"));
		textname.click();

		WebElement ddlday = driver.findElement(By.id("days"));
		Select select = new Select(ddlday);
		select.selectByIndex(3);

		WebElement ddlmonth = driver.findElement(By.xpath("//select[@id='months']"));
		Select selectmonth = new Select(ddlmonth);
		selectmonth.selectByVisibleText("March");

		WebElement ddlyear = driver.findElement(By.id("dob"));
		Select selectyear = new Select(ddlyear);
		selectyear.selectByValue("1990");

		WebElement btnsubmit = driver.findElement(By.id("submitbtn"));
		btnsubmit.click();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(scr);
		File dest = new File(
				"C:\\\\Users\\\\Admin\\\\eclipse-workspace\\\\OMRBranchSeleniumTasks_Velmurugan\\\\library\\\\omr4.png");
		FileUtils.copyFile(scr, dest);
	}

	public static void t1405_login() throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();

		TakesScreenshot ts = (TakesScreenshot) driver;
		File scr = ts.getScreenshotAs(OutputType.FILE);
		System.out.println(scr);

		File dest = new File(
				"C:\\Users\\Admin\\eclipse-workspace\\OMRBranchSeleniumTasks_Velmurugan\\library\\omr5.png");
		FileUtils.copyFile(scr, dest);

	}

	public static void main(String[] args) throws IOException, InterruptedException {
		t1401_login();
		t1402_login();
		t1403_login();
		t1404_login();
		t1405_login();
	}
}