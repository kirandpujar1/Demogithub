package com.org.learnmaven.myMavenPrj;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AppTest {
@Test
public void test() {
	//Assert.fail();
	//Reporter.log("Hi", true);
	//System.setProperty("webdriver.gecko.driver", "C:/BSSW11/Automation/driver/geckodriver.exe");
	//WebDriver driver = new FirefoxDriver();
	
	
	//System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	System.setProperty("webdriver.chrome.driver", "C:/BSSW11/Automation/driver/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	
	//dr.get("http://www.google.com");
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("kiran_d_pujar@yahoo.com");
	driver.findElement(By.id("pass")).sendKeys("neha1912");
//	driver.findElement(By.id("loginButton")).sendKeys(Keys.ENTER);
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	//driver.findElement(By.xpath("//span[.='Kiran Pujar']")).click();	
	}
}
