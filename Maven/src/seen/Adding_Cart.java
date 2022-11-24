package seen;

 
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Adding_Cart {
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//		WebDriverWait wa=new WebDriverWait(dr, Duration.ofSeconds(5));
		dr.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		String[] names= {"Carrot","Tomato"};
		Adding_Cart obj=new Adding_Cart();
		obj.Items(dr, names);
		
		
	}
	public void Items(WebDriver dr,String[] names) throws InterruptedException
	{
		
		int j=0;
		List < WebElement> pro=dr.findElements(By.xpath("//h4[@class='product-name']"));
		
		List items=Arrays.asList(names);
		for(int i=0;i<pro.size();i++)
		{
			String[] name=pro.get(i).getText().split("-");
			String fin=name[0].trim();
			System.out.println(fin);
//			fin=fin.toLowerCase();
			
			if(items.contains(fin))
			{
				j++;
				dr.findElements(By.xpath("//div[@class='product-action']")).get(i).click();
				if(j==3)
					break;
				
			}
		}
		
		dr.findElement(By.xpath("//img[@alt='Cart']")).click();
		dr.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
//		wa.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoCode")));
		dr.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
//		wa.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("promobtn")));
		dr.findElement(By.className("promobtn")).click();
//		wa.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(".promoInfo")));
		System.out.println(dr.findElement(By.cssSelector(".promoInfo")).getText());
		dr.findElement(By.xpath("//button[text()='Place Order']")).click();
	    WebElement ele=dr.findElement(By.xpath("//div/select"));
		Select s=new Select(ele);
		s.selectByVisibleText("India");
		dr.findElement(By.className("chkAgree")).click();
		dr.findElement(By.xpath("//button[text()='Proceed']")).click();

	}

}
