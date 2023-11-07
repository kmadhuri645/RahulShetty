package DropdownSElectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DaynamicDropDown55 {

	public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		

       //ChromeOptions option=new ChromeOptions();
      // option.addArguments("--disable-notifications");


        WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		driver.findElement(By.xpath("//input[@autocapitalize='sentences']")).click();
		driver.findElement(By.xpath("//div[text()='Bengaluru']")).click();
		
        driver.findElement(By.xpath("(//input[@autocapitalize=\"sentences\"])[2]")).click();
        driver.findElement(By.xpath("//div[text()='Chennai']")).click();
        
        driver.findElement(By.xpath("//div[text()='15']")).click();
	}

}
