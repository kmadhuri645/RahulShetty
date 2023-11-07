package POPup;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayAddToCart {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("------------starting ------------");
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		int j=0;
		String[] itemNeeded= {"Cucumber","Brocolli","Beetroot"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(2000);
		
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
				if(j==4)
				{
					break;
				}
			}
		}
		
		
	}

}
