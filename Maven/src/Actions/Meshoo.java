package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Meshoo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		//dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.get("https://www.meesho.com/");
		WebElement we=dr.findElement(By.xpath("(//div[@class='CommonFooter__DescriptionText-sc-1t22x5s-0 dtvJJj'])[5]"));
		int size=we.findElements(By.tagName("a")).size();
		for(int i=0;i<=size-1;i++)
		{
			String key=Keys.chord(Keys.CONTROL,Keys.ENTER);
			we.findElements(By.tagName("a")).get(i).sendKeys(key);
		}
		Set<String> st=dr.getWindowHandles();
		Iterator<String> it=st.iterator();
		while(it.hasNext())
		{
			String s=dr.switchTo().window(it.next()).getTitle();
			System.out.println(s);
		}
	}
	

}
