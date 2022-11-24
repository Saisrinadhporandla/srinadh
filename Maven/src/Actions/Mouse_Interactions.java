package Actions;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_Interactions {
	@Test
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.amazon.in/");
		Actions ac=new Actions(dr);
		@SuppressWarnings("unused")
		WebElement we=dr.findElement(By.cssSelector("#nav-link-accountList"));
		//ac.moveToElement(we).build().perform();
		ac.moveToElement(dr.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("sai").build().perform();
		
	}

}
