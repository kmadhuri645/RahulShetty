package saucelab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//without page factory
public class LoginPage {
	
	WebDriver driver;
	//constructor
	LoginPage(WebDriver d)
	{
		driver=d;
	}
	//identify the web element
	//create method on operation to be performed on web element
	
	By username =By.id("user-name");
	By password=By.id("password");
	By loginBtn=By.id("login-button");
	
	public void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	public void enterPassword(String pwd) {
		driver.findElement(password).sendKeys(pwd);
	}
	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	

}
