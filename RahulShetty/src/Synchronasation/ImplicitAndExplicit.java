package Synchronasation;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitAndExplicit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String[] itemNeeded= {"Cucumber","Brocolli","Beetroot"};
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		additems(driver,itemNeeded);
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
	}
	public static void additems(WebDriver driver, String[] itemNeeded) {
		
	int j=0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
	for(int i=0;i<products.size();i++)
	{
		//Brocolli-1kg
		String[] name=products.get(i).getText().split("-");
		String formattedName=name[0].trim();
		// formate  it to get actual vegetable name
		//convert array into array list for easy  search
		//check whether name you extracted is present in arrayList or not
		
		List itemNeededList=Arrays.asList(itemNeeded);
		
		if(itemNeededList.contains(formattedName)) {
			j++;
			//click on add to cart
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			if(j==itemNeeded.length)
			{
				break;
			}
		}
	}
	}
}
