package com.phoenix.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIndexTest {

	public static void main(String[] args) {
		
		//for chrome webdriver.chrome.driver -> chromedriver.exe
		System.setProperty("webdriver.gecko.driver", "E:/libraries/geckodriver.exe");
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=new FirefoxDriver();
		driver.get("http://localhost:8081/LoginApp/index.html");
		WebElement txt1=driver.findElement(By.id("user"));
		txt1.sendKeys("Chetan");
		WebElement submit=driver.findElement(By.xpath("//div[@id='subform']//input[@type='submit']"));
		submit.click();
		//Get the web element representing the check box.
		//Click on it to turn it on
		//Get the web element representing the partner's name
		//use Assert.assertFalse(driver.findElement(By.xpath(//input[@id='partner'])).isEnabled());
		System.out.println(submit);
		/*
		 * driver.get("http://localhost:8081/LoginApp/index.html"); WebElement
		 * user=driver.findElement(By.id("user")); user.sendKeys("Chetan");
		 * 
		 * WebElement pass=driver.findElement(By.name("password"));
		 * pass.sendKeys("123456");
		 * 
		 * WebElement submit=driver.findElement(By.xpath(
		 * "//div[@id='subform']//input[@type='submit']"));
		 */
		//System.out.println(submit.getText());
		
		/*
		 * WebElement link=driver.findElement(By.partialLinkText("Log")); link.click();
		 */
		
		//submit.click();
		//System.out.println(user.toString());
		//clear, click, isEnabled, isDisplayed, isSelected, getLocation, getSize
	}

}
