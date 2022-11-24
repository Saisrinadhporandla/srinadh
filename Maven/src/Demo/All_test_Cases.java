package Demo;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class All_test_Cases {
	@Test
	public void main() {
		System.out.println("Enter 1 to Test Email field blank");
		System.out.println("Enter 2 to Test password  field blank");
		System.out.println("Enter 3 to Test with invalid mobile number");
		System.out.println("Enter 4 to Test with valid mobile number And In valid Password");
		System.out.println("Enter 5 to Test with invalid OTP");
		System.out.println("Enter 6 to Test with invalid mail id format");
		System.out.println("Enter 7 to Test with valid mobile number And 7valid Password");
		System.out.println("Enter 0 to Exit");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
	   switch(num)
	   {
	   case 1 :   blankMail();
	   break;
	   case 2 :   blank_Pswd();
	   break;
	   case 3 :   invalid_MblNo();
	   break;
	   case 4 :   invalid_pswd();
	   break;
	   case 5 :   invalid_OTP();
	   break;
	   case 6 :   invalid_Mail();
	   break;
	   case 7 :   valid_Credentials();
	   break;
	   case 0 :  break;
	   }
	}
	public  WebDriver common_Code()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com/");
		dr.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		return dr;
	}
	
	public  void blankMail() 
	{
		WebDriver dr=common_Code();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriver dr=new ChromeDriver();
		
		//email field blank 
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("  ");
		
		dr.findElement(By.cssSelector("input#continue")).click();
		System.out.println(dr.findElement(By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]")).getText());
		Assert.assertEquals(dr.findElement(By.xpath("//div[contains(text(),'Enter your email or mobile phone number')]")).getText(), "Enter your email or mobile phone number");
		
	}
	public void blank_Pswd()
	{
		WebDriver dr=common_Code();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//valid mail Id
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("porandlasaisrinadh@gmail.com");
		dr.findElement(By.cssSelector("input#continue")).click();
		//blank password
		dr.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("");
		dr.findElement(By.className("a-button-input")).click();
		System.out.println(dr.findElement(By.xpath("(//div[@class='a-alert-content'])[2]")).getText());
		
	}
	public void invalid_MblNo()
	{
		WebDriver dr=common_Code();
		
		//Invalid Mobile Number
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("87656888");
		dr.findElement(By.cssSelector("input#continue")).click();
		System.out.println(dr.findElement(By.xpath("//span[@class='a-list-item']")).getText());
		Assert.assertEquals(dr.findElement(By.xpath("//span[@class='a-list-item']")).getText(),"We cannot find an account with that mobile number");
		
	}
	public void invalid_pswd()
	{
		WebDriver dr=common_Code();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//valid Mobile Number
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9704219395");
		dr.findElement(By.cssSelector("input#continue")).click();
		// InValid Password
		dr.findElement(By.id("ap_password")).sendKeys("Srin@21");
		dr.findElement(By.id("signInSubmit")).click();
		
	}
	public void invalid_OTP()
	{
		WebDriver dr=common_Code();
		// valid Mobile Number
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9704219395");
		dr.findElement(By.cssSelector("input#continue")).click();
		// log in using InValid OTP
		dr.findElement(By.xpath("//input[@id='continue']")).click();
		dr.findElement(By.id("cvf-input-code")).sendKeys("ugyfy767");
		dr.findElement(By.className("a-button-input")).click();
		System.out.println(dr.findElement(By.xpath("(//div[@class='a-alert-content'])[2]")).getText());
	
	}
	public void invalid_Mail()
	{
		WebDriver dr=common_Code();
		//invalid Email
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("@gmail.comsaidotsrinadh");
		dr.findElement(By.cssSelector("input#continue")).click();
		System.out.println(dr.findElement(By.className("a-alert-heading")).getText());
		Assert.assertEquals(dr.findElement(By.className("a-alert-heading")).getText(), "There was a problem");
	}
	public void valid_Credentials()
	{
		WebDriver dr=common_Code();
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9704219395");
		dr.findElement(By.cssSelector("input#continue")).click();
		// InValid Password
		dr.findElement(By.id("ap_password")).sendKeys("Srin@dh2448");
		dr.findElement(By.id("signInSubmit")).click();
	}
	}
