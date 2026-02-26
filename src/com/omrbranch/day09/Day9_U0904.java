package com.omrbranch.day09;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Day9_U0904 {

		public static void t0906_login() throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			//.driver.navigate().to("https://www.omrbranch.com/api/documentation");
			Thread.sleep(8000);
			driver.get("https://greenstechchennaiomr@gmail.com:Greens@123@//www.omrbranch.com/api/documentation");
			driver.manage().window().maximize();
			
			

		}
		
		public static void main(String[] args) throws InterruptedException {
			t0906_login() ;
		}
	}

