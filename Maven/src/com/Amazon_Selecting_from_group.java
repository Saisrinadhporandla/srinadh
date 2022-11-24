package com;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Selecting_from_group {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(1000);
		//valid Mobile Number
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9704219395");
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("input#continue")).click();
		// Valid Password
		dr.findElement(By.id("ap_password")).sendKeys("Srin@dh2448");
		dr.findElement(By.id("signInSubmit")).click();
	   Thread.sleep(1000);
	    
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 13 pro max");
		dr.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> prod=dr.findElements(By.cssSelector(".a-size-mini.a-spacing-none.a-color-base.s-line-clamp-2"));
		for(int i=0;i<prod.size();i++)
		{
			String name=prod.get(i).getText();
			name=name.toLowerCase();
			if(name.contains("Apple iphone 13 pro max"))
			{
	//			dr.findElement(By.)
			}
		}
	}

}
