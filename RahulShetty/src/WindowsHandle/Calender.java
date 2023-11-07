package WindowsHandle;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)");
		//Aug23
		driver.findElement(By.xpath("//input[@placeholder='Date of travel']")).click();

		List<WebElement> Dates = driver.findElements(By.cssSelector("span[class='flatpickr-day ']"));
        //grab common attribute //put into list and itirate
		int Count=driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).size();
		
		for (int i=0;i<Count;i++) {
			String text=driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).getText();
			if(text.equalsIgnoreCase("23")) {
			    driver.findElements(By.cssSelector("span[class='flatpickr-day ']")).get(i).click();
				break;
			}
				 
		}
	}

}
