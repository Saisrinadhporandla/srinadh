package Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Spliting_String {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.tsrtconline.in/oprs-web/");
		System.out.println(dr.findElement(By.xpath("//div/h1")).getText());
		dr.findElement(By.xpath("//div/h1")).getText();
	}

}
