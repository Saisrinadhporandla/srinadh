package com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;



public class Amazon_TestCase_8 {

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
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("input#continue")).click();
		//log in using inValid OTP format
		dr.findElement(By.xpath("//input[@id='continue']")).click();
		dr.findElement(By.id("cvf-input-code")).sendKeys("tyhn4");
		dr.findElement(By.className("a-button-input")).click();
		System.out.println(dr.findElement(By.xpath("//div[contains(text(),'Invalid OTP. ')]")).getText());
		Assert.assertEquals((dr.findElement(By.xpath("//div[contains(text(),'Invalid OTP.')]")).getText()),"Invalid OTP. Please check your code and try again.");
	}
}