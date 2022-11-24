package Demo;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Amazon_URL_Test {
	@Test
	public void Test() throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

         driver.get("https://www.amazon.com/");
         List<WebElement> links=  driver.findElements(By.cssSelector("div[id='navFooter'] a"));

      SoftAssert a =new SoftAssert();
      for(WebElement link : links)
      {
    	  String url= link.getAttribute("href");
          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
          conn.setRequestMethod("HEAD");
          conn.connect();
          int respCode = conn.getResponseCode();
          System.out.println(respCode);
//          if(respCode>400)
//          {
//        	 System.out.println( "The link with Text"+link.getText()+" is broken with code " +respCode);
//          }
      
         
          a.assertTrue(respCode<400, "The link with Text" +link.getText()+" is broken with code" +respCode);

      }
       a.assertAll();

	}
	}
