package Actions;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Auto {
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		//dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		dr.findElement(By.id("checkBoxOption2")).click();
		String st=dr.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(st);
		WebElement we=dr.findElement(By.id("dropdown-class-example"));
		Select sc=new Select(we);
		sc.selectByVisibleText(st);
		dr.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(st);
		dr.findElement(By.id("alertbtn")).click();
		Thread.sleep(2000);
		String al=dr.switchTo().alert().getText();
		//System.out.println(al);
		if(al.contains(st))
		{
			System.out.println(al+" = "+st);
		}
		else
		{
			System.out.println(al+" != "+st);
		}
		
	}
		

}
