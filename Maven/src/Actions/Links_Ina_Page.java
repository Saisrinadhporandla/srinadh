package Actions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Links_Ina_Page {
	@Test
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://www.amazon.com");
		//overal links 
		System.out.println(dr.findElements(By.tagName("a")).size());
		//footer tag links
		WebElement dr1=dr.findElement(By.id("navFooter"));
		System.out.println(dr1.findElements(By.tagName("a")).size());
		WebElement dr2=dr.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]"));
		int size=dr2.findElements(By.tagName("a")).size();
		@SuppressWarnings("unused")
		Actions a=new Actions(dr);
		for(int i=0;i<=size-1;i++)
		{
			String s=Keys.chord(Keys.CONTROL,Keys.ENTER);
			dr2.findElements(By.tagName("a")).get(i).sendKeys(s);
			Thread.sleep(5000);
		}
		Set<String> st=dr.getWindowHandles();
		Iterator<String> it=st.iterator();
		while(it.hasNext())
		{
			dr.switchTo().window(it.next());
			System.out.println(dr.getTitle());
		}
		
		
	}

}
