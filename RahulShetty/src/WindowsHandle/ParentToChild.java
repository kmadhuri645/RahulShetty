package WindowsHandle;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ParentToChild {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		System.out.println(it);
		String ParentId = it.next();
		String ChildId = it.next();
		
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.xpath("p[class='im-para red']")).getText());
		driver.findElement(By.xpath("p[class='im-para red']"));
	}

}
