package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipcart_Windows_Title {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.flipkart.com/");
		WebElement footer=dr.findElement(By.xpath("(//div[@class='_2Brcj4'])[4]"));
		int siz=footer.findElements(By.tagName("a")).size();
		System.out.println(siz);
		
		Actions a=new Actions(dr);
		for(int i=0;i<=siz-1;i++)
		{
			String key=Keys.chord(Keys.CONTROL,Keys.ENTER);
			footer.findElements(By.tagName("a")).get(i).sendKeys(key);
			Thread.sleep(1000);
		}
		Set<String> ele=dr.getWindowHandles();
		Iterator<String> it=ele.iterator();
		while(it.hasNext())
		{
			dr.switchTo().window(it.next());
			System.out.println(dr.getTitle());
		}
		
		
		
		
	}

}
