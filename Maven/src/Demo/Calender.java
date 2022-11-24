package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.tsrtconline.in/oprs-web/");
		dr.findElement(By.id("txtJourneyDate")).click();
		
		List<WebElement> s=dr.findElements(By.xpath("//a[@class='ui-state-default']"));
	    int size=s.size();
		System.out.println(size);
		for(int i=0;i<=size;i++)
		{
			String date=s.get(i).getText();
			if(date.equalsIgnoreCase("1"))
			{
				dr.findElements(By.xpath("//a[@class='ui-state-default']")).get(i).click();
				break;
			}
		}
		System.out.println(dr.findElement(By.id("txtJourneyDate")).getText());
	}

}
