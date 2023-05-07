package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	static WebDriver driver;
	
	public WebDriver initBrowser()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions cp= new ChromeOptions();
		cp.addArguments("--remote-allow-origins=*");
	 driver = new ChromeDriver(cp);
	 
	 return driver;
	}
	
	
	public static WebDriver getDriver()
	{
		return driver;
	}
	

}