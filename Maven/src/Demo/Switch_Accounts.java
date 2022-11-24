package Demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Switch_Accounts {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		WebDriverWait wa=new WebDriverWait(dr, Duration.ofSeconds(5));
		dr.get("https://www.amazon.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		dr.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		Thread.sleep(1000);
		//valid Mobile Number
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9704219395");
		Thread.sleep(1000);
		dr.findElement(By.cssSelector("input#continue")).click();
		// Valid Password
		dr.findElement(By.id("ap_password")).sendKeys("Srin@dh2448");
		dr.findElement(By.id("signInSubmit")).click();
		dr.findElement(By.linkText("Switch Accounts")).click();
		
	}

}
