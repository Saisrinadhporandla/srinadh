package Streams;

import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Sorted_Veg {
  @Test
  public void elements()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		List<WebElement> l=dr.findElements(By.xpath("//tr/td[2]"));
	   List<String> l1=l.stream().map(i->i.getText()).sorted().collect(Collectors.toList());
	   List<String> l2=l.stream().map(i->i.getText()).collect(Collectors.toList());
	 Assert.assertTrue(l1.equals(l2));
	   
	   
  }

}
