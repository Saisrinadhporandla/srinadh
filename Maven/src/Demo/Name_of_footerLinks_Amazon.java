package Demo;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Name_of_footerLinks_Amazon {
	@SuppressWarnings("deprecation")
	@Test
	public void Test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.get("https://www.amazon.com/");
		int size=dr.findElements(By.tagName("a")).size();
		System.out.println("total no of links or Url's in amazon "+size);
		WebElement we=dr.findElement(By.xpath("(//div[@class='navFooterLinkCol navAccessibility'])[1]"));
		int size1=we.findElements(By.tagName("a")).size();;
		for(int i=0;i<=size1-1;i++)
		{
			String key=Keys.chord(Keys.CONTROL,Keys.ENTER);
			we.findElements(By.tagName("a")).get(i).sendKeys(key);
		}
		Set<String> links=dr.getWindowHandles();
		Iterator<String> it=links.iterator();
		while(it.hasNext())
		{
			dr.switchTo().window(it.next());
			System.out.println(dr.getTitle());
		}
		
	}

}