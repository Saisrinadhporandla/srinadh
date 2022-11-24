package Actions;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Switching_windows {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.get("https://the-internet.herokuapp.com/windows");
		//dr.findElement(By.linkText("Multiple Windows")).click();
		dr.findElement(By.xpath("//div[@class='example']/a")).click();
		Set<String> windows =dr.getWindowHandles();
        Iterator<String> s=windows.iterator();
		String parent=s.next();
		String child =s.next();
		dr.switchTo().window(child);
		System.out.println(dr.findElement(By.cssSelector("div[class='example'] h3")).getText());
		dr.switchTo().window(parent);
		System.out.println(dr.findElement(By.xpath("//div/h3")).getText());
		
	}

}
