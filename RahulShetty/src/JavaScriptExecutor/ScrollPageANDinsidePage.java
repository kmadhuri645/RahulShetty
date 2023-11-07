package JavaScriptExecutor;

import java.util.List;

import org.apache.logging.log4j.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollPageANDinsidePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(5000);
		//scrolling the table inside the page
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");//dom object
        List<WebElement> value = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int sum=0;
        for(int i=0; i<value.size();i++) {
        	sum=sum+Integer.parseInt(value.get(i).getText());
        }
        System.out.println(sum);
        driver.findElement(By.cssSelector("totalAmount")).getText();
        int total=Integer.parseInt(driver.findElement(By.cssSelector("totalAmount")).getText().split(":")[1].trim());
        
	}

}
