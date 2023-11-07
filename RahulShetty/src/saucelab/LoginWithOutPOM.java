package saucelab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginWithOutPOM {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("downloading driver");
		WebDriverManager.chromedriver().setup();
	
		//System.setProperty("webdriver.chrome.driver", "D:\\OppsConcepts\\RahulShetty\\Drivers\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		Thread.sleep(1000);
		driver.findElement(By.id("login-button")).click();
		System.out.println("clicked");
		Thread.sleep(1000);
				
	}
	

}
