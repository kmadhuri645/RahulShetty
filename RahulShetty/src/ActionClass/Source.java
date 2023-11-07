package ActionClass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Source {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// 1.give me the count of link on the page //a
		System.out.println(driver.findElements(By.tagName("a")).size());

		// 2.give me the count of footerlink on the page
		WebElement footerdriver = driver.findElement(By.id("gf-BIG"));// limiting web driver scope
		System.out.println(footerdriver.findElements(By.tagName("a")).size());
		
		//3 give me the count of firstcolumn footerlink on the page
		WebElement Firstcolumdriver = driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(Firstcolumdriver.findElements(By.tagName("a")).size());
		
		//4.click on each and every firstcolumn footerlink and check every page are opening or not
		for(int i=0; i<Firstcolumdriver.findElements(By.tagName("a")).size();i++) {
			String ClickOnLinkTab=Keys.chord(Keys.CONTROL ,Keys.ENTER);
			Firstcolumdriver.findElements(By.tagName("a")).get(i).sendKeys(ClickOnLinkTab);
			Thread.sleep(5000);
		}//this for loop open all the tabs
			
			Set<String> abc = driver.getWindowHandles();
			Iterator<String> it = abc.iterator();
			
			while(it.hasNext()) {
				driver.switchTo().window(it.next());
			}
		

	}
}
