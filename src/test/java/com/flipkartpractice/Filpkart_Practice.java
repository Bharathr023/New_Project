package com.flipkartpractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Filpkart_Practice {

	private static void browserLaunch() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthi\\eclipse-workspace\\AdactinProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		 driver.findElement(By.xpath("(//img[@loading='lazy'])[2]")).click();
		 
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 WebElement electronics = driver.findElement(By.xpath("(//span[@class='_2I9KP_'])[1]"));
		  Actions ac = new Actions (driver);
		  ac.moveToElement(electronics).build().perform();
		  
		  driver.findElement(By.xpath("//a[text()='Mi']")).click();
		
	}
	public static void main(String[] args) {
		browserLaunch();
	}
}
