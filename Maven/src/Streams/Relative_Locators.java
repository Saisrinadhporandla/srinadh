package Streams;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

import java.util.Iterator;
import java.util.Set;

public class Relative_Locators {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver dr=new ChromeDriver();
			dr.get("https://tinyurl.com/4btvymkx");
	        dr.switchTo().newWindow(WindowType.TAB);
	       Set<String> window= dr.getWindowHandles();
	       Iterator<String> it=window.iterator();
	      String parent= it.next();
	      String child= it.next();
	      dr.switchTo().window(child);
	      dr.get("https://www.swiggy.com/");
	    String[] s= dr.findElement(By.cssSelector("._1E3AJ")).getText().split(" ");
	    String name=s[6].trim();
	    dr.switchTo().window(parent);
	    dr.findElement(By.cssSelector("[id='ap_email']")).sendKeys(name);
	      
		}
		

}
