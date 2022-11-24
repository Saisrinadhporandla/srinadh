package seen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rahul_Setty {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/locatorspractice/");
		dr.findElement(By.id("inputUsername")).sendKeys("sai srinadh");
		dr.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		dr.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		Thread.sleep(2000);
		dr.findElement(By.cssSelector("button.go-to-login-btn")).click();
		dr.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
		Thread.sleep(2000);
		dr.findElement(By.cssSelector("input#chkboxTwo")).click();
		dr.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		dr.findElement(By.className("logout-btn")).click();
		dr.close();
		
	}
	
}
