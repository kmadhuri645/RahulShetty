package DropdownSElectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;


public class CalenderIsEnabled {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
        Assert.assertFalse(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
        System.out.println(driver.findElement(By.xpath("//div[text()='Departure Date']")).isEnabled());
        System.out.println(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style"));
        
        if(driver.findElement(By.xpath("//div[text()='Return Date']")).getAttribute("style").contains("0.5"))
        {
        	System.out.println("is Enabled");
        	Assert.assertTrue(true);
        }
        else
        {
        	Assert.assertTrue(false);
        }
        
	}

}
