package udmy;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SslCheck {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		Proxy proxy=new Proxy();
		proxy.setHttpProxy("ipaddress:4444");
		options.setCapability("proxy", proxy);
		
		FirefoxOptions options1 = new FirefoxOptions();
        options1.setAcceptInsecureCerts(true);

		EdgeOptions options2 = new EdgeOptions();
        options.setAcceptInsecureCerts(true);

		WebDriver driver = new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");

		System.out.println(driver.getTitle());



	}

}
