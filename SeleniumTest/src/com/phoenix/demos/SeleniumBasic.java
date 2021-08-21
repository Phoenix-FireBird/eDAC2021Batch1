package com.phoenix.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * 
 * @author admin
 * 
 */

public class SeleniumBasic {

	public static void main(String[] args) {

		//For chrome the system variable is webdriver.chrome.driver
		System.setProperty("webdriver.gecko.driver", "c:/geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		String url="http://localhost:8081/LoginApp/index.html";
		driver.get(url);
		System.out.println(driver.getTitle());
		WebElement txtBox=driver.findElement(By.id("user"));
		//name, xpath, linkText, className, tagName
		//findElements() which returns a list<WebElements>
		
		System.out.println(txtBox.toString());
		txtBox.sendKeys("Random");
		WebElement submitButton=driver.findElement(By.id("subform"));
		submitButton.click();
		
		//driver.close(); //Closes the window created by this execution
		//driver.quit(); 	//closes all windows created by this execution
	}

}
