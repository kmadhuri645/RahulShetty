package udmy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("[id='name']")).click();
		driver.findElement(By.cssSelector("[id='name']")).sendKeys("Rahul");
		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().dismiss();
	}
}
