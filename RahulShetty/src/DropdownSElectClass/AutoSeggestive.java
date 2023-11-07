package DropdownSElectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSeggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	    driver.findElement(By.id("autosuggest")).sendKeys("ind");
	    Thread.sleep(3000);
	    
	   List<WebElement> options = driver.findElements(By.cssSelector("a[id=\"ui-id-118\"]"));
	   
	   for(WebElement option:options)
	   {
		   if(option.getText().equalsIgnoreCase("india"))
		   {
			   option.click();
			   break;
		   }
	   }
	}

}
