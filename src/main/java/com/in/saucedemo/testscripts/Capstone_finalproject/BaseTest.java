package com.in.saucedemo.testscripts.Capstone_finalproject;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BaseTest {
	ChromeDriver driver;
	@BeforeClass
	public void launchApplication()
	{
		{
			// 1) Open the browser
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(options);
			// 2) Maximize it
			driver.manage().window().maximize();
			// 3) Navigate to application
			driver.get("https://www.saucedemo.com/");
			
		}}
			@Test
			public void login() {
			// 4) Login into it
			driver.findElement(By.id("user-name")).sendKeys("standard_user");
			driver.findElement(By.id("password")).sendKeys("secret_sauce");
			driver.findElement(By.id("login-button")).click();
			}
			@Test
			public void addItem() {
			// 5) Add item to the cart 
			driver.findElement(By.xpath("(//button[contains(@class,'btn btn_primary btn_small btn_inventory')])[1]")).click();
			}
			@Test
			public void addCart() {
			// 6) Go to the cart 
			driver.findElement(By.xpath("//a[contains(@class,'shopping_cart_link')]")).click();
			}
			@Test
			public void checkOut() {
			// 7) Checkout the item 
			driver.findElement(By.id("checkout")).click();
			}
			@Test
			public void checkoutinfo() {
			// 8) Enter the details of the customer 
			driver.findElement(By.id("first-name")).sendKeys("vaishnavi");
			driver.findElement(By.id("last-name")).sendKeys("sekar");
			driver.findElement(By.id("postal-code")).sendKeys("609806");
			}
			@Test
			public void placeOrder() {
			// 9) Click on continue button 
			driver.findElement(By.id("continue")).click();
			}
			@Test
			public void orderFinish() {
			// 10) Click on finish 
			driver.findElement(By.id("finish")).click();
			}
			// 11) Close the browser
			@Test

			public void closeBrowser()
			{
			driver.quit();
			}
			}


	 
	 


