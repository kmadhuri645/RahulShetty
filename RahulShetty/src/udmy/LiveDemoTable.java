package udmy;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class LiveDemoTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		//click on column
		driver.findElement(By.xpath("//tr//th[1]")).click(); 
		
		//capture all the webelements into list
		List<WebElement> elementList = driver.findElements(By.xpath("//tr//td[1]")); 
		
		//capture text of all webelements into new (original)list
		List<String> orginalList = elementList.stream().map(s->s.getText()).collect(Collectors.toList());
		
		//sort the original list of step-3 ----sorted list
		List<String> sortedList = orginalList.stream().sorted().collect(Collectors.toList());
		
		//compare original list vs sorted list
		Assert.assertTrue(orginalList.equals(sortedList));
		
		
	}

}
