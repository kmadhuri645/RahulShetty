package DropdownSElectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UpdatedDropdown {

	public static void main(String[] args) throws InterruptedException {
     System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		
   ChromeOptions option=new ChromeOptions();
    option.addArguments("--disable-notifications");


WebDriver driver = new ChromeDriver(option);
		
		driver.get("https://www.spicejet.com/");
		//driver.findElement(By.xpath("//div[text()='Passengers']")).click();
		driver.findElement(By.xpath("//div[text()='1 Adult']/following-sibling::div")).click();
		int i=1;
		System.out.println("------------------");
		while(i<5)
		{
			driver.findElement(By.xpath("//div[contains(@data-testid,'Adult-testID-plus-one-cta')]")).click();
			i++;
			System.out.println("--------8888888----------");
		}
		System.out.println("------------------");
		Thread.sleep(1000);
		System.out.println(driver.findElement(By.xpath("//div[text()='1 Adult']/following-sibling::div")).getText());
		
		}
}