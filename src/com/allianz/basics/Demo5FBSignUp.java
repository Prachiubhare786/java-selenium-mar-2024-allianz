package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo5FBSignUp {

	public static void main(String[] args) {
		
		

		 WebDriver driver=new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		 
		driver.get("https://www.facebook.com/");
		
		//click on create new account
		//eneter first name as john
		
		driver.findElement(By.linkText("Create new account")).click();
		
	driver.findElement(By.name("firstname")).sendKeys("John");
	
	driver.findElement(By.name("lastname")).sendKeys("wick");
	
	driver.findElement(By.name("reg_passwd__")).sendKeys("test123");
	
	
	driver.findElement(By.xpath("// input[@value='-1']")).click();
	
	
	//Dropdown select 14 Apr 1970
	
	//driver.findElement(By.id("day")).sendKeys("14");
	
	Select selectDay =new Select(driver.findElement(By.id("day")));
	
	selectDay.selectByVisibleText("14");
	
	//Select Month
	
	Select selectmonth=new Select(driver.findElement(By.id("month")));	
	
	selectmonth.selectByVisibleText("Apr");
	
	//Select year 1970
	
	Select selectyear=new Select(driver.findElement(By.id("year")));
	
	selectyear.selectByVisibleText("1970");
	
	
	
	
	
	
	
	
	
	}
}

