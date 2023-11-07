package udmy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Chapter11 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\OppsConcepts\\Selenium_project\\Drivers\\chromedriver.exe");
		
		//System.setProperty("webdriver.gecko.driver", "D:\\OppsConcepts\\Selenium_project\\Drivers\\geckodriver.exe");
		System.out.println("property is set");
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(DurationofSecond(5));
		
		System.out.println("mADHURI");
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.findElement(By.id("inputUsername")).sendKeys("madhuri");
		driver.findElement(By.name("inputPassword")).sendKeys("123");
		driver.findElement(By.className("submit")).click();
	   // driver.findElement(By.cssSelector("error")).getText();
	    driver.findElement(By.linkText("Forgot your password?")).click();
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("madhu");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("kmadhuri");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		//driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("jkmklv");
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("kmadhuri");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("1234567");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.cssSelector("form p")).getText());
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#inputUsername")).sendKeys("madhuri");
		driver.findElement(By.cssSelector("input[placeholder*='Pass']")).sendKeys("12345");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class , 'submit ')]")).click();
		driver.close();
		
		

	}


}
