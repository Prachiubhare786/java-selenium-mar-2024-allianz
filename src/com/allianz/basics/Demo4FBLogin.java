package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo4FBLogin {

	public static void main(String[] args) {
		
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/?d=topnav2-btn-ft");
		
		
		driver.findElement(By.name("UserFirstName")).sendKeys("john");
		
		
		driver.findElement(By.name("UserLastName")).sendKeys("wick");
		
		driver.findElement(By.name("UserEmail")).sendKeys("p@gamil.com");
			
		driver.findElement(By.name("UserTitle")).sendKeys("IT Manager");
		
		  
		  
		  Select country =new Select(driver.findElement(By.name("CompanyCountry")));
			
			country.selectByVisibleText("Algeria");
		  
		  driver.findElement(By.name("start my free trial")).click();//
		  
		  driver.findElement(By.name("CompanyName")).sendKeys("Allianz");
		  
		
//Select selectemp=new Select(driver.findElement(By.name("CompanyEmployees")));
		
		//selectemp.selectByVisibleText("101 to 200");
		

//
	
	//Select selectemp1=new Select(driver.findElement(By.name("CompanyEmployees")));
	
		//selectemp1.selectByVisibleText("101 to 200");
		
 // driver.findElement(By.className("checkbox-ui")).click();
  
 // driver.findElement(By.name("start my free trial")).click();
		
		
		
		
		
		
		
		
		
		
		
		//Enter Username --> as Hello1234578@gmail.com
		
//	driver.findElement(By.id("email")).sendKeys("Hello1234578@gmail.com");
	
	//driver.findElement(By.id("pass")).sendKeys("Jack123");
	
	//click on login
	//driver.findElement(By.name("login")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
