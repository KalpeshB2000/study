package com.mydata;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Createacc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS TUF GAMING\\OneDrive\\Desktop\\seleniumk30\\chromedriver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.flipkart.com/");
		driver.get("https://www.amazon.in/-/hi/ap/signin?openid.pape.max_auth_age=3600&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fspr%2Freturns%2Fgift&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=amzn_psr_desktop_in&openid.mode=checkid_setup&language=en_IN&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
	    driver.findElement(By.id("ap_email")).sendKeys("kalpeshbagade61144@gmail.com");
	    
	    driver.findElement(By.id("ap_password")).sendKeys("#shadow@2762");
	    
	    driver.findElement(By.id("signInSubmit")).click();
	    
	    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobile");
	   
	    //Thread.sleep(5000);
	
	
	
	
	}

}
