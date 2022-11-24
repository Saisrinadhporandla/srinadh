package Demo;

import org.testng.annotations.Test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Create_Account {
	@Test
	public void Test() throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(1000);
		dr.findElement(By.linkText("Create your Amazon account")).click();
		Thread.sleep(1000);
		dr.findElement(By.id("ap_customer_name")).sendKeys("sai srinadh");
		dr.findElement(By.id("ap_email")).sendKeys("saidotsrinadh@gmail.com");
		dr.findElement(By.cssSelector("#ap_password")).sendKeys("Saisrinadh@123");
		dr.findElement(By.id("ap_password_check")).sendKeys("Saisrinadh@123");
		dr.findElement(By.id("continue")).click();
		dr.close();
	}



}
