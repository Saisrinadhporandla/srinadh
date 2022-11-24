package com;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LAmazon_TestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(1000);
		//invalid Email
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("@gmail.comsaidotsrinadh");
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("input#continue")).click();
		System.out.println(dr.findElement(By.className("a-alert-heading")).getText());
		Assert.assertEquals(dr.findElement(By.className("a-alert-heading")).getText(), "There was a problem");
	}

}
