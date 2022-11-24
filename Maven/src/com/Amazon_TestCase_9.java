package com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Amazon_TestCase_9 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(1000);
		//valid Mobile Number
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9704219395");
		dr.findElement(By.cssSelector("input#continue")).click();
		Thread.sleep(1000);
		//forgot password
		dr.findElement(By.xpath("//a[@id='auth-fpp-link-bottom']")).click();
		dr.findElement(By.id("continue")).click();
	}
  
}