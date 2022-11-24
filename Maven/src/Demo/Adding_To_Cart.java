package Demo;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Adding_To_Cart {
	@Test
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		dr.manage().window().maximize();
		dr.get("https://www.amazon.com/");
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		dr.findElement(By.id("nav-link-accountList-nav-line-1")).click();
		
		//valid Mobile Number
		dr.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("9704219395");
		
		dr.findElement(By.cssSelector("input#continue")).click();
		// Valid Password
		dr.findElement(By.id("ap_password")).sendKeys("Srin@dh2448");
		dr.findElement(By.id("signInSubmit")).click();
		
		dr.findElement(By.id("twotabsearchtextbox")).sendKeys("one plus 10 pro");
		dr.findElement(By.id("nav-search-submit-button")).click();
		dr.findElement(By.xpath("//div[@class='s-widget-container s-spacing-small s-widget-container-height-small celwidget slot=MAIN template=SEARCH_RESULTS widgetId=search-results_3']//span[@class='a-size-medium a-color-base a-text-normal'][contains(text(),'OnePlus 10 Pro | 5G Android Smartphone | 8GB+128GB')]")).click();
		dr.findElement(By.id("add-to-cart-button")).click();
		Thread.sleep(2000);
		System.out.println(dr.findElement(By.cssSelector("div[id='attachDisplayAddBaseAlert'] h4[class='a-alert-heading']")).getText());

	}
	
}

