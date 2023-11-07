package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions a=new Actions(driver);
		WebElement move =driver.findElement(By.id("nav-link-accountList"));
		
		WebElement CaptalLatter = driver.findElement(By.id("twotabsearchtextbox"));
		a.click(CaptalLatter).keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
		
		a.moveToElement(move).build().perform();
		

	}

}
