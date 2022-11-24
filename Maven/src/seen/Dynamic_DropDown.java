package seen;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamic_DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\saisrinadh.porandla\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement dropDown=dr.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select s=new Select(dropDown);
		s.selectByVisibleText("USD");
		
	}

}
