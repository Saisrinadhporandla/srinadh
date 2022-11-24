package Demo;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BigBasket {
	@Test
	public  void Cart() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.manage().window().maximize();
		dr.get("https://www.bigbasket.com/member/smart-basket/?nc=My%20Smart%20Basket#!page=2");
		String[] veg= {"Carrot","Potato","Onion"};
		List<WebElement> pro=dr.findElements(By.xpath("//a[@ng-bind='vm.selectedProduct.p_desc']"));
		List items=Arrays.asList(veg);
		int j=0;
		for(int i=0;i<=pro.size()-1;i++)
		{
				String[] name=pro.get(i).getText().split(" ");
				
				String fin=name[0].trim();
				if(items.contains(fin))
				{
					j++;
					dr.findElements(By.xpath("//button[@type='button'][normalize-space()='Add']")).get(i).click();
					if(j==3)
						break;
				}
				
				
		}
		Actions ac=new Actions(dr);
		ac.moveToElement(dr.findElement(By.cssSelector("a[qa='myBasket']"))).build().perform();
}
}

