package Actions;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		//dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.get("https://www.makemytrip.com/homestays/");
	   WebElement we=dr.findElement(By.xpath("//ul[@class='makeFlex font12']"));
	   int size=we.findElements(By.tagName("a")).size();
	  for(int i=0;i<=size-1;i++)
	  {
		  String names=we.findElements(By.tagName("a")).get(i).getText();
		  if(names.equalsIgnoreCase("hotels"))
		  {
			  we.findElements(By.tagName("a")).get(i).click();
		  }
	  }
	}
}
