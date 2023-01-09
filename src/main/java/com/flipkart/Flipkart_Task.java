package com.flipkart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_Task {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\karthi\\eclipse-workspace\\AdactinProject\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//List<WebElement> links = 
		//int size = links.size();
		System.out.println("Size of links "+driver.findElements(By.tagName("a")).size());
		
	//	List<WebElement> about = 
	//	int size2 = about.size();
		System.out.println("Size of last links "+driver.findElements(By.xpath("//div[@class='_2WErco row']//a")).size());
		
		
	//	List<WebElement> about1 = 	int size3 = about1.size();
		System.out.println("Size of about "+driver.findElements(By.xpath("//div[@class='_2Brcj4']//child::div[text()='ABOUT']//following-sibling::a")).size());
		
	}
	

}
