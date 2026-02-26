package com.omrbranch.day08;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day8_U0803 {

	public static void t0803_login() throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.omrbranch.com/");
		driver.manage().window().maximize();

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);

		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);

		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);

		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);

		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_T);

		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);

		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);

		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);

		robot.keyPress(KeyEvent.VK_H);
		robot.keyRelease(KeyEvent.VK_H);

		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

	

		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);

		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);

		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);

		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);

		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);

		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);

		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);

		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);

		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);

		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);

		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);

		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);

		robot.keyPress(KeyEvent.VK_PERIOD);
		robot.keyRelease(KeyEvent.VK_PERIOD);

		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);

		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);

		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);

		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_R);
		robot.keyRelease(KeyEvent.VK_R);

		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

		robot.keyPress(KeyEvent.VK_E);
		robot.keyRelease(KeyEvent.VK_E);

		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);

		robot.keyPress(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_S);

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyPress(KeyEvent.VK_2);
		
		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_1);
		robot.keyRelease(KeyEvent.VK_1);

		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);

		robot.keyPress(KeyEvent.VK_3);
		robot.keyRelease(KeyEvent.VK_3);
		
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);



	}

	public static void main(String[] args) throws AWTException {

		t0803_login();
	}

}
