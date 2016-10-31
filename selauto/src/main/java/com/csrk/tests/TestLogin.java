package com.csrk.tests;

import java.awt.Button;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestLogin {
	
	public static final Logger LOG = LoggerFactory.getLogger(TestLogin.class);
	
	WebDriver webDriver;
	
	@BeforeTest
	public void setup(){
		webDriver = new FirefoxDriver();
	}
	
	@AfterTest
	public void teardown(){
		
		webDriver.quit();
	}
	
	
    @Test
    public void testValidLogin(){
    	webDriver.get("http://24.106.206.2:10080/autotools");
    	
    	WebElement email = webDriver.findElement(By.id("j_username"));
    	email.sendKeys("divya@csrk.com");
    	
    	WebElement pwd = webDriver.findElement(By.id("j_password"));
    	pwd.sendKeys("divya33");
    	
    	WebElement signIn = webDriver.findElement(By.tagName("button"));
    	signIn.click();
    	
    	WebDriverWait wait = new WebDriverWait(webDriver, 15);
    	WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("p")));
    	
    	Assert.assertNotNull(element);
    	
    	
    }
    
    @Test
    public void testInValidLogin(){
    	webDriver.get("http://24.106.206.2:10080/autotools");
    	
    	WebElement email = webDriver.findElement(By.id("j_username"));
    	email.sendKeys("divya@csrk.com");
    	
    	WebElement pwd = webDriver.findElement(By.id("j_password"));
    	pwd.sendKeys("divya33");
    	
    	WebElement signIn = webDriver.findElement(By.tagName("button"));
    	signIn.click();
    	
    	WebDriverWait wait = new WebDriverWait(webDriver, 15);
    	WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(By.tagName("p")));
    	
    	Assert.assertNotNull(element);
    	
    	
    }

}
