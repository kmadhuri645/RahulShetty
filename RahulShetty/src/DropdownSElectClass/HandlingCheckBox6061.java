package DropdownSElectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;

public class HandlingCheckBox6061 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.spicejet.com/");
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
		driver.findElement(By.xpath("//div[text()='Senior Citizen']")).click();
		System.out.println(driver.findElement(By.xpath("//div[text()='Senior Citizen']")).isSelected());
	

	}

}