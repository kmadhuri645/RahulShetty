package saucelab;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	public static void main(String[] args) {
		//Lounch the chromebrowser
		
		System.out.println("downloading driver");
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		//Create object for loginpage
		
		LoginPage2 loginPg=new LoginPage2(driver);
		driver.get("https://www.saucedemo.com/");
		
		loginPg.enterUsername("standard_user");
		loginPg.enterPassword("secret_sauce");
		loginPg.clickOnLoginBtn();
		
       
	}

}
